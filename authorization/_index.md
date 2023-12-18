---
title: "Jakarta Authorization"
summary: "Jakarta Authorization defines a low-level SPI for authorization modules, which are repositories of permissions 
facilitating subject based security by determining whether a given subject has a given permission, and algorithms
to transform security constraints for specific containers (such as Jakarta Servlet or Jakarta Enterprise Beans) into 
these permissions."
description: "Find all releases of the Jakarta Authentication specification. This specification defines a low-level SPI for authorization modules in Jakarta EE."
seo_title: "Jakarta Authorization Specification | Jakarta EE | The Eclipse Foundation"
#<!--.................0123456789.123456789.123456789.123456789.123456789.123456789-->
summary_sixty_char: "Low-level container SPI for authorization modules"
project_id: "ee4j.authorization"
---

{{< grid/div class="specifications-content" >}}

## Jakarta Authorization Explained

Security is a major component of application development. Jakarta EE provides
the robust [Jakarta Security specification](/specifications/security/) 
that when paired with the [Jakarta Authentication](/specifications/authentication/) 
and Jakarta Authorization specifications, provides APIs that deliver end-to-end
security. There are a large number of application processes that require
security measures, and these specifications provide the ability to do so in a
straightforward manner using annotations and minimal XML configurations.
Jakarta EE compliant containers and deployment environments adhere to the
constructs of the Authentication and Authorization policies to ensure that
applications can be secured in a standard way and deployed across a number of
different environments.

### Jakarta Authorization:

Jakarta Authorization is another integral specification that goes hand in hand
with Jakarta Security. It consists of a low-level SPI for authorization policy
modules, which are repositories of permissions which determine whether a
subject has a given permissions to access a requested resource. This
specification defines a contract between containers and authorization policy
modules, which provides authorization functionality to suit the operational
environment. The contract is divided into three subcontracts, which together,
describe the installation and configuration of the authorization providers.

- Provider Configuration Subcontract: Defines requirements placed on providers
  and containers such that Policy providers may be integrated with containers.
- Policy Configuration Subcontract: Defines interactions between container
  deployment tools and providers to support translation of authorization
  policies into policy statements within a Java SE Policy provider.
- Policy Decision and Enforcement Subcontract: Defines the interactions between
  container policy enforcement points and providers that implement policy
  decisions that are required by containers.

Jakarta Authorization provides a standard means for working within the
boundaries of each of the three subcontracts.  The Policy Configuration
Subcontract works along with the standard java.security.Policy to provide
standard policies for a container. It also provides a means of configuring
policies using policy providers, such that the policy can be changed to reflect
what is needed for the specific environment. Jakarta Authorization also
provides a means for configuring security groups, roles, and constraints for
restricting access to particular pages within an application. The Policy
Configuration Subcontract specifies a means for ensuring that the container
will adhere to a standard method for specifying such roles and permissions.
Lastly, the Policy Decision and Enforcement Subcontract ensures that policies
are enforced in a standard way across Jakarta Servlets and Jakarta Enterprise
Beans.

{{</ grid/div >}}
