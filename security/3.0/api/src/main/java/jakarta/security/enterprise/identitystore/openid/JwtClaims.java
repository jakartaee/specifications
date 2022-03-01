/*
 * Copyright (c) 2021, 2022 Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 *
 */

/*
 *
 * Contributors:
 *   2021 : Payara Foundation and/or its affiliates
 *      Initially authored in Security Connectors
 */

package jakarta.security.enterprise.identitystore.openid;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.*;

/**
 * Standard JWT claims. A token typically.
 *
 *
 */
public interface JwtClaims extends Claims {

    /**
     * The principal that issued the JWT
     * @return value of {@code iss} claim
     */
    default Optional<String> getIssuer() {
        return getStringClaim("iss");
    }

    /**
     * The principal that is the
     *    subject of the JWT.  The claims in a JWT are normally statements
     *    about the subject.
     * @return value of {@code sub} claim
     */
    default Optional<String> getSubject() {
        return getStringClaim("sub");
    }

    /**
     * The recipients that the JWT is intended for. To ease work with the field, audience is always represented as list,
     * also in special cases -- it is singleton list when it was a string in the token, and empty set if it was not present.
     * @return non-null set representing the values of {@code aud} claim
     */
    default List<String> getAudience() {
        return getArrayStringClaim("aud");
    }

    /**
     * Expiration time on or after which the JWT MUST NOT be accepted for processing.
     * @return value of {@code exp} claim
     */
    default Optional<Instant> getExpirationTime() {
        return getNumericDateClaim("exp");
    }

    /**
     * Check if JWT is expired
     * @param clock Clock representing reference time of checking
     * @param required indication whether the claim is required, i. e. whether token with claim is considered expired
     * @param skew allowed clock skew to account for drift between provider and us
     * @return {@code} true when current time is past expiration time, or {@code exp} claim is not present and {@code required} is {@code true}
     */
    default boolean isExpired(Clock clock, boolean required, Duration skew) {
        return getExpirationTime().map(exp -> clock.millis() - exp.toEpochMilli() > skew.toMillis())
                .orElse(required);
    }

    /**
     * The time before which the JWT MUST NOT be accepted for processing.
     * @return
     */
    default Optional<Instant> getNotBeforeTime() {
        return getNumericDateClaim("nbf");
    }

    /**
     * Check if JWT is before its defined validity
     * @param clock Clock representing reference time of checking
     * @param required indication, whether the claim is required, i. e. whether token without nbf is considered before validity
     * @param skew allowed clock skew to account for drift between provider and us
     * @return
     */
    default boolean isBeforeValidity(Clock clock, boolean required, Duration skew) {
        return getNotBeforeTime().map(nbf -> nbf.toEpochMilli() - clock.millis() > skew.toMillis())
                .orElse(required);
    }

    /**
     * Check JWT validity against current time with 1MIN clock skew.
     * @return true if exp token is present and within limits and nbf is within limits when present
     */
    default boolean isValid() {
        Duration skew = Duration.ofMinutes(1);
        return !isExpired(Clock.systemUTC(), true, skew) && !isBeforeValidity(Clock.systemUTC(), false, skew);
    }

    /**
     * The time at which the JWT was issued.
     * @return value of {@code exp} claim
     */
    default Optional<Instant> getIssuedAt() {
        return getNumericDateClaim("iat");
    }

    /**
     * Unique identifier for the JWT
     * @return value of {@code jti} claim
     */
    default Optional<String> getJwtId() {
        return getStringClaim("jti");
    }

    /**
     * Singleton instance representing no claims
     */
    JwtClaims NONE = new JwtClaims() {
        @Override
        public Optional<String> getStringClaim(String name) {
            return Optional.empty();
        }

        @Override
        public Optional<Instant> getNumericDateClaim(String name) {
            return Optional.empty();
        }

        @Override
        public List<String> getArrayStringClaim(String name) {
            return Collections.emptyList();
        }

        @Override
        public OptionalInt getIntClaim(String name) {
            return OptionalInt.empty();
        }

        @Override
        public OptionalLong getLongClaim(String name) {
            return OptionalLong.empty();
        }

        @Override
        public OptionalDouble getDoubleClaim(String name) {
            return OptionalDouble.empty();
        }

        @Override
        public Optional<Claims> getNested(String name) {
            return Optional.empty();
        }
    };
}
