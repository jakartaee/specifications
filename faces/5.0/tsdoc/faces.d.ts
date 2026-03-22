/*
 * Copyright (c) 2024 Contributors to the Eclipse Foundation
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
 */

/**
 * <span class="changed_modified_2_2">The top level global namespace
 * for the Jakarta Faces JavaScript API.</span>
 * @namespace
 * @since 2.0
 */
export declare namespace faces {

    /**
     * <p>An integer specifying the specification version that this file implements.
     * Its format is: rightmost two digits, bug release number, next two digits,
     * minor release number, leftmost digits, major release number.
     * This number may only be incremented by a new release of the specification.</p>
     * @since 2.0
     */
    export const specversion: number;

    /**
     * <p>An integer specifying the implementation version that this file implements.
     * It's a monotonically increasing number, reset with every increment of
     * <code>{@link faces.specversion}</code>
     * This number is implementation dependent.</p>
     * @since 2.0
     */
    export const implversion: number;

    /**
     * <p class="changed_added_2_2">The result of calling
     * <code>UINamingContainer.getNamingContainerSeparatorChar().</code></p>
     * @since 2.2
     */
    export const separatorchar: string;

    /**
     * <p class="changed_added_2_3">
     * The result of calling <code>ExternalContext.getRequestContextPath()</code>.
     * @since 2.3
     */
    export const contextpath: string;

    /**
     * <span class="changed_modified_2_2 changed_modified_2_3">The namespace for Ajax
     * functionality.</span>
     * @namespace
     * @since 2.0
     */
    export namespace ajax {

        /**
         * Register a callback for error handling.
         * <p><b>Usage:</b></p>
         * <pre><code>const handleError = function handleError(data) {
         *     // ...
         * }
         * 
         * faces.ajax.addOnError(handleError);</code></pre>
         * <p><b>Implementation Requirements:</b></p>
         * This function must accept a reference to an existing JavaScript function.
         * The JavaScript function reference must be added to a list of callbacks, making it possible
         * to register more than one callback by invoking <code>faces.ajax.addOnError</code>
         * more than once.  This function must throw an error if the <code>callback</code>
         * argument is not a function.
         *
         * @param callback a reference to a function to call on an error
         * @since 2.0
         */
        export function addOnError(callback: Function): void;

        /**
         * Register a callback for event handling.
         * <p><b>Usage:</b></p>
         * <pre><code>const statusUpdate = function statusUpdate(data) {
         *     // ...
         * }
         * 
         * faces.ajax.addOnEvent(statusUpdate);</code></pre>
         * <p><b>Implementation Requirements:</b></p>
         * This function must accept a reference to an existing JavaScript function.
         * The JavaScript function reference must be added to a list of callbacks, making it possible
         * to register more than one callback by invoking <code>faces.ajax.addOnEvent</code>
         * more than once.  This function must throw an error if the <code>callback</code>
         * argument is not a function.
         *
         * @param callback a reference to a function to call on an event
         * @since 2.0
         */
        export function addOnEvent(callback: Function): void;
        
        /**
         * <p><span class="changed_modified_2_2">Send</span> an
         * asynchronous Ajax request to the server.
         * <p><b>Usage:</b></p>
         * Example showing all optional arguments:
         * <pre><code>&lt;button
         *     id="button1"
         *     value="submit"
         *     onclick="faces.ajax.request(this, event, {
         *         execute: 'button1',
         *         render: 'status',
         *         onevent: handleEvent,
         *         onerror: handleError
         *      }); return false;"&gt;
         * &lt;/button&gt;
         * </code></pre>
         * <p><b>Implementation Requirements:</b></p>
         * This function must:
         * <ul>
         * <li>Be used within the context of a <code>form</code><span class="changed_added_2_3">,
         * else throw an error</span>.</li>
         * <li>Capture the element that triggered this Ajax request
         * (from the <code>source</code> argument, also known as the
         * <code>source</code> element.</li>
         * <li>If the <code>source</code> element is <code>null</code> or
         * <code>undefined</code> throw an error.</li>
         * <li>If the <code>source</code> argument is not a <code>string</code> or
         * DOM element object, throw an error.</li>
         * <li>If the <code>source</code> argument is a <code>string</code>, find the
         * DOM element for that <code>string</code> identifier.
         * <li>If the DOM element could not be determined, throw an error.</li>
         * <li class="changed_added_2_3">If the <code>jakarta.faces.ViewState</code>
         * element could not be found, throw an error.</li>
         * <li class="changed_added_2_3">If the ID of the <code>jakarta.faces.ViewState</code>
         * element has a <code>&lt;VIEW_ROOT_CONTAINER_CLIENT_ID&gt;&lt;SEP&gt;</code>
         * prefix, where &lt;SEP&gt; is the currently configured
         * <code>UINamingContainer.getSeparatorChar()</code> and
         * &lt;VIEW_ROOT_CONTAINER_CLIENT_ID&gt; is the return from
         * <code>UIViewRoot.getContainerClientId()</code> on the
         * view from whence this state originated, then remember it as <i>namespace prefix</i>.
         * This is needed during encoding of the set of post data arguments.</li>
         * <li>If the <code>onerror</code> and <code>onevent</code> arguments are set,
         * they must be functions, or throw an error.
         * <li>Determine the <code>source</code> element's <code>form</code>
         * element.</li>
         * <li>Get the <code>form</code> view state by calling
         * <code>{@link faces.getViewState}</code> passing the
         * <code>form</code> element as the argument.</li>
         * <li>Collect post data arguments for the Ajax request.
         * <ul>
         * <li>The following name/value pairs are required post data arguments:
         * <table border="1">
         * <tr>
         * <th>name</th>
         * <th>value</th>
         * </tr>
         * <tr>
         * <td><code>jakarta.faces.ViewState</code></td>
         * <td>Contents of <code>jakarta.faces.ViewState</code> hidden field.This is included when
         * <code>{@link faces.getViewState}</code> is used.</td>
         * </tr>
         * <tr>
         * <td><code>jakarta.faces.partial.ajax</code></td>
         * <td><code>true</code></td>
         * </tr>
         * <tr>
         * <td><code>jakarta.faces.source</code></td>
         * <td>The identifier of the element that triggered this request.</td>
         * </tr>
         * <tr class="changed_added_2_2">
         * <td><code>jakarta.faces.ClientWindow</code></td>
         * <td>Call <code>{@link faces.getClientWindow}</code>, passing the current
         * form.  If the return is non-<code>null</code>, it must be set as the
         * value of this name/value pair, otherwise, a name/value
         * pair for client window must not be sent.</td>
         * </tr>
         * </table>
         * </li>
         * </ul>
         * </li>
         * <li>Collect optional post data arguments for the Ajax request.
         * <ul>
         * <li>Determine additional arguments (if any) from the <code>options</code>
         * argument. If <code>options.execute</code> exists:
         * <ul>
         * <li>If the keyword <code>@none</code> is present, do not create and send
         * the post data argument <code>jakarta.faces.partial.execute</code>.</li>
         * <li>If the keyword <code>@all</code> is present, create the post data argument with
         * the name <code>jakarta.faces.partial.execute</code> and the value <code>@all</code>.</li>
         * <li>Otherwise, there are specific identifiers that need to be sent.  Create the post
         * data argument with the name <code>jakarta.faces.partial.execute</code> and the value as a
         * space delimited <code>string</code> of client identifiers.</li>
         * </ul>
         * </li>
         * <li>If <code>options.execute</code> does not exist, create the post data argument with the
         * name <code>jakarta.faces.partial.execute</code> and the value as the identifier of the
         * element that caused this request.</li>
         * <li>If <code>options.render</code> exists:
         * <ul>
         * <li>If the keyword <code>@none</code> is present, do not create and send
         * the post data argument <code>jakarta.faces.partial.render</code>.</li>
         * <li>If the keyword <code>@all</code> is present, create the post data argument with
         * the name <code>jakarta.faces.partial.render</code> and the value <code>@all</code>.</li>
         * <li>Otherwise, there are specific identifiers that need to be sent.  Create the post
         * data argument with the name <code>jakarta.faces.partial.render</code> and the value as a
         * space delimited <code>string</code> of client identifiers.</li>
         * </ul>
         * <li>If <code>options.render</code> does not exist do not create and send the
         * post data argument <code>jakarta.faces.partial.render</code>.</li>
         * <li class="changed_added_2_2">If
         * <code>options.delay</code> exists let it be the value
         * <em>delay</em>, for this discussion.  If
         * <code>options.delay</code> does not exist, or is the
         * literal string <code>'none'</code>, without the quotes,
         * no delay is used.  If less than <em>delay</em>
         * milliseconds elapses between calls to <em>request()</em>
         * only the most recent one is sent and all other requests
         * are discarded.</li>
         * <li class="changed_added_2_2">If
         * <code>options.resetValues</code> exists and its value is
         * <code>true</code>, ensure a post data argument with the
         * name <code>jakarta.faces.partial.resetValues</code> and the
         * value <code>true</code> is sent in addition to the other
         * post data arguments.  This will cause
         * <code>UIViewRoot.resetValues()</code> to be called,
         * passing the value of the "render" attribute.  Note: do
         * not use any of the <code>@</code> keywords such as
         * <code>@form</code> or <code>@this</code> with this option
         * because <code>UIViewRoot.resetValues()</code> does not
         * descend into the children of the listed components.</li>
         * <li>Determine additional arguments (if any) from the <code>event</code>
         * argument.  The following name/value pairs may be used from the
         * <code>event</code> object:
         * <ul>
         * <li><code>target</code> - the ID of the element that triggered the event.</li>
         * <li><code>captured</code> - the ID of the element that captured the event.</li>
         * <li><code>type</code> - the type of event (ex: onkeypress)</li>
         * <li><code>alt</code> - <code>true</code> if ALT key was pressed.</li>
         * <li><code>ctrl</code> - <code>true</code> if CTRL key was pressed.</li>
         * <li><code>shift</code> - <code>true</code> if SHIFT key was pressed. </li>
         * <li><code>meta</code> - <code>true</code> if META key was pressed. </li>
         * <li><code>right</code> - <code>true</code> if right mouse button
         * was pressed. </li>
         * <li><code>left</code> - <code>true</code> if left mouse button
         * was pressed. </li>
         * <li><code>keycode</code> - the key code.
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li>Encode the set of post data arguments. <span class="changed_added_2_3">
         * If the <code>jakarta.faces.ViewState</code> element has a namespace prefix, then
         * make sure that all post data arguments are prefixed with this namespace prefix.
         * </span></li>
         * <li>Join the encoded view state with the encoded set of post data arguments
         * to form the <code>query string</code> that will be sent to the server.</li>
         * <li>Create a request <code>context</code> object and set the properties:
         * <ul><li><code>source</code> (the source DOM element for this request)</li>
         * <li><code>onerror</code> (the error handler for this request)</li>
         * <li><code>onevent</code> (the event handler for this request)</li></ul>
         * The request context will be used during error/event handling.</li>
         * <li>Send a <code>begin</code> event following the procedure as outlined
         * in the Jakarta Faces Specification Document section 13.3.5.3 "Sending Events".</li>
         * <li>Set the request header with the name: <code>Faces-Request</code> and the
         * value: <code>partial/ajax</code>.</li>
         * <li>Determine the <code>posting URL</code> as follows: If the hidden field
         * <code>jakarta.faces.encodedURL</code> is present in the submitting form, use its
         * value as the <code>posting URL</code>.  Otherwise, use the <code>action</code>
         * property of the <code>form</code> element as the <code>URL</code>.</li>
         * <li>
         * <p><span class="changed_modified_2_2">Determine whether
         * or not the submitting form is using
         * <code>multipart/form-data</code> as its
         * <code>enctype</code> attribute.  If not, send the request
         * as an <code>asynchronous POST</code> using the
         * <code>posting URL</code> that was determined in the
         * previous step.</span> <span
         * class="changed_added_2_2">Otherwise, send the request
         * using a multi-part capable transport layer, such as a
         * hidden inline frame.  Note that using a hidden inline
         * frame does <strong>not</strong> use
         * <code>XMLHttpRequest</code>, but the request must be sent
         * with all the parameters that a Faces
         * <code>XMLHttpRequest</code> would have been sent with.
         * In this way, the server side processing of the request
         * will be identical whether or the request is multipart or
         * not.</span></p>
         * <div class="changed_added_2_2">
         * <p>The <code>begin</code>, <code>complete</code>, and
         * <code>success</code> events must be emulated when using
         * the multipart transport.  This allows any listeners to
         * behave uniformly regardless of the multipart or
         * <code>XMLHttpRequest</code> nature of the transport.</p>
         * </div></li>
         * </ul>
         * Form serialization should occur just before the request is sent to minimize
         * the amount of time between the creation of the serialized form data and the
         * sending of the serialized form data (in the case of long requests in the queue).
         * Before the request is sent it must be put into a queue to ensure requests
         * are sent in the same order as when they were initiated.  The request callback function
         * must examine the queue and determine the next request to be sent.  The behavior of the
         * request callback function must be as follows:
         * <ul>
         * <li>If the request completed successfully invoke <code>{@link faces.ajax.response}</code>
         * passing the <code>request</code> object.</li>
         * <li>If the request did not complete successfully, notify the client.</li>
         * <li>Regardless of the outcome of the request (success or error) every request in the
         * queue must be handled.  Examine the status of each request in the queue starting from
         * the request that has been in the queue the longest.  If the status of the request is
         * <code>complete</code> (readyState 4), dequeue the request (remove it from the queue).
         * If the request has not been sent (readyState 0), send the request.  Requests that are
         * taken off the queue and sent should not be put back on the queue.</li>
         * </ul>
         *
         * </p>
         *
         * @param source The DOM element that triggered this Ajax request, or an id string of the
         * element to use as the triggering element.
         * @param event The DOM event that triggered this Ajax request.  The
         * <code>event</code> argument is optional.
         * @param options The set of available options that can be sent as
         * request parameters to control client and/or server side
         * request processing. Acceptable name/value pair options are:
         * <table border="1">
         * <tr>
         * <th>name</th>
         * <th>value</th>
         * </tr>
         * <tr>
         * <td><code>execute</code></td>
         * <td>space seperated list of client identifiers</td>
         * </tr>
         * <tr>
         * <td><code>render</code></td>
         * <td>space seperated list of client identifiers</td>
         * </tr>
         * <tr>
         * <td><code>onevent</code></td>
         * <td>function to callback for event</td>
         * </tr>
         * <tr>
         * <td><code>onerror</code></td>
         * <td>function to callback for error</td>
         * </tr>
         * <tr>
         * <td><code>params</code></td>
         * <td>object containing parameters to include in the request</td>
         * </tr>
         * <tr class="changed_added_2_2">
         * <td><code>delay</code></td>
         * <td>If less than <em>delay</em> milliseconds elapses
         * between calls to <em>request()</em> only the most recent
         * one is sent and all other requests are discarded. If the
         * value of <em>delay</em> is the literal string
         * <code>'none'</code> without the quotes, or no delay is
         * specified, no delay is used. </td>
         * </tr>
         * <tr class="changed_added_2_2">
         * <td><code>resetValues</code></td>
         * <td>If true, ensure a post data argument with the name
         * jakarta.faces.partial.resetValues and the value true is
         * sent in addition to the other post data arguments. This
         * will cause UIViewRoot.resetValues() to be called, passing
         * the value of the "render" attribute. Note: do not use any
         * of the @ keywords such as <code>@form</code> or <code>@this</code> with this option
         * because UIViewRoot.resetValues() does not descend into
         * the children of the listed components.</td>
         * </tr>
         * </table>
         * The <code>options</code> argument is optional.
         * @throws {Error} If first required argument
         * <code>element</code> is not specified, or if one or more
         * of the components in the <code>options.execute</code>
         * list is a file upload component, but the form's enctype
         * is not set to <code>multipart/form-data</code>
         * @since 2.0
         */
        export function request(source: Element | string, event?: Event, options?: { execute?: string, render?: string, onevent?: Function, onerror?: Function, params?: object, delay?: string | number, resetValues?: boolean }): void;
        
        /**
         * <p><span class="changed_modified_2_2">Receive</span> an Ajax response
         * from the server.
         * <p><b>Usage:</b></p>
         * <pre><code>faces.ajax.response(request, context);</code></pre>
         * <p><b>Implementation Requirements:</b></p>
         * This function must evaluate the markup returned in the
         * <code>request.responseXML</code> object and perform the following action:
         * <ul>
         * <li>If there is no XML response returned, signal an <code>emptyResponse</code>
         * error. If the XML response does not follow the format as outlined
         * in Appendix A.3 "XML Schema Definition For Partial Response" of the Jakarta Faces Specification Document
         * signal a <code>malformedError</code> error.  Refer to
         * Jakarta Faces Specification Document section 13.3.6.3 "Signaling Errors".</li>
         * <li>If the response was successfully processed, send a <code>success</code>
         * event as outlined in Jakarta Faces Specification Document section 13.3.5.3 "Sending Events".</li>
         * </ul>
         * <p><i>Update Element Processing</i></p>
         * The <code>update</code> element is used to update a single DOM element.  The
         * "id" attribute of the <code>update</code> element refers to the DOM element that
         * will be updated.  The contents of the <code>CDATA</code> section is the data that
         * will be used when updating the contents of the DOM element as specified by the
         * <code>&lt;update&gt;</code> element identifier.
         * <ul>
         * <li>If an <code>&lt;update&gt;</code> element is found in the response
         * with the identifier <code>jakarta.faces.ViewRoot</code>:
         * <pre><code>&lt;update id="jakarta.faces.ViewRoot"&gt;
         *     &lt;![CDATA[...]]&gt;
         * &lt;/update&gt;</code></pre>
         * Update the entire DOM replacing the appropriate <code>head</code> and/or
         * <code>body</code> sections with the content from the response.</li>
         * <li class="changed_modified_2_2">If an
         * <code>&lt;update&gt;</code> element is found in the
         * response with an identifier containing
         * <code>jakarta.faces.ViewState</code>:
         * <pre><code>&lt;update id="&lt;VIEW_ROOT_CONTAINER_CLIENT_ID&gt;&lt;SEP&gt;jakarta.faces.ViewState&lt;SEP&gt;&lt;UNIQUE_PER_VIEW_NUMBER&gt;"&gt;
         *    &lt;![CDATA[...]]&gt;
         * &lt;/update&gt;</code></pre>
         * locate and update the submitting form's
         * <code>jakarta.faces.ViewState</code> value with the
         * <code>CDATA</code> contents from the response.
         * &lt;SEP&gt; is the currently configured
         * <code>UINamingContainer.getSeparatorChar()</code>.
         * &lt;VIEW_ROOT_CONTAINER_CLIENT_ID&gt; is the return from
         * <code>UIViewRoot.getContainerClientId()</code> on the
         * view from whence this state originated.
         * &lt;UNIQUE_PER_VIEW_NUMBER&gt; is a number that must be
         * unique within this view, but must not be included in the
         * view state.  This requirement is simply to satisfy XML
         * correctness in parity with what is done in the
         * corresponding non-partial Faces view.  Locate and update
         * the <code>jakarta.faces.ViewState</code> value for all
         * Faces forms covered in the <code>render</code> target
         * list whose ID starts with the same
         * &lt;VIEW_ROOT_CONTAINER_CLIENT_ID&gt; value.</li>
         * <li class="changed_added_2_2">If an
         * <code>update</code> element is found in the response with
         * an identifier containing
         * <code>jakarta.faces.ClientWindow</code>:
         * <pre><code>&lt;update id="&lt;VIEW_ROOT_CONTAINER_CLIENT_ID&gt;&lt;SEP&gt;jakarta.faces.ClientWindow&lt;SEP&gt;&lt;UNIQUE_PER_VIEW_NUMBER&gt;"&gt;
         *    &lt;![CDATA[...]]&gt;
         * &lt;/update&gt;</code></pre>
         * locate and update the submitting form's
         * <code>jakarta.faces.ClientWindow</code> value with the
         * <code>CDATA</code> contents from the response.
         * &lt;SEP&gt; is the currently configured
         * <code>UINamingContainer.getSeparatorChar()</code>.
         * &lt;VIEW_ROOT_CONTAINER_CLIENT_ID&gt; is the return from
         * <code>UIViewRoot.getContainerClientId()</code> on the
         * view from whence this state originated.
         * &lt;UNIQUE_PER_VIEW_NUMBER&gt; is a number that must be
         * unique within this view, but must not be included in the
         * view state.  This requirement is simply to satisfy XML
         * correctness in parity with what is done in the
         * corresponding non-partial Faces view.  Locate and update
         * the <code>jakarta.faces.ClientWindow</code> value for all
         * Faces forms covered in the <code>render</code> target
         * list whose ID starts with the same
         * &lt;VIEW_ROOT_CONTAINER_CLIENT_ID&gt; value.</li>
         * <li class="changed_added_2_3">If an <code>update</code> element is found in the response with the
         * identifier <code>jakarta.faces.Resource</code>:
         * <pre><code>&lt;update id="jakarta.faces.Resource"&gt;
         *    &lt;![CDATA[...]]&gt;
         * &lt;/update&gt;</code></pre>
         * append any element found in the <code>CDATA</code> contents which is absent in the document to the
         * document's <code>head</code> section.
         * </li>
         * <li>If an <code>update</code> element is found in the response with the identifier
         * <code>jakarta.faces.ViewHead</code>:
         * <pre><code>&lt;update id="jakarta.faces.ViewHead"&gt;
         *    &lt;![CDATA[...]]&gt;
         * &lt;/update&gt;</code></pre>
         * update the document's <code>head</code> section with the <code>CDATA</code>
         * contents from the response.</li>
         * <li>If an <code>update</code> element is found in the response with the identifier
         * <code>jakarta.faces.ViewBody</code>:
         * <pre><code>&lt;update id="jakarta.faces.ViewBody"&gt;
         *    &lt;![CDATA[...]]&gt;
         * &lt;/update&gt;</code></pre>
         * update the document's <code>body</code> section with the <code>CDATA</code>
         * contents from the response.</li>
         * <li>For any other <code>&lt;update&gt;</code> element:
         * <pre><code>&lt;update id="update id"&gt;
         *    &lt;![CDATA[...]]&gt;
         * &lt;/update&gt;</code></pre>
         * Find the DOM element with the identifier that matches the
         * <code>&lt;update&gt;</code> element identifier, and replace its contents with
         * the <code>&lt;update&gt;</code> element's <code>CDATA</code> contents.</li>
         * </li>
         * </ul>
         * <p><i>Insert Element Processing</i></p>
         * <ul>
         * <li>If an <code>&lt;insert&gt;</code> element is found in
         * the response with a nested <code>&lt;before&gt;</code>
         * element:
         * <pre><code>&lt;insert&gt;
         *     &lt;before id="before id"&gt;
         *        &lt;![CDATA[...]]&gt;
         *     &lt;/before&gt;
         * &lt;/insert&gt;</code></pre>
         *
         * <ul>
         * <li>Extract this <code>&lt;before&gt;</code> element's <code>CDATA</code> contents
         * from the response.</li>
         * <li>Find the DOM element whose identifier matches <code>before id</code> and insert
         * the <code>&lt;before&gt;</code> element's <code>CDATA</code> content before
         * the DOM element in the document.</li>
         * </ul>
         * </li>
         *
         * <li>If an <code>&lt;insert&gt;</code> element is found in
         * the response with a nested <code>&lt;after&gt;</code>
         * element:
         *
         * <pre><code>&lt;insert&gt;
         *     &lt;after id="after id"&gt;
         *        &lt;![CDATA[...]]&gt;
         *     &lt;/after&gt;
         * &lt;/insert&gt;</code></pre>
         *
         * <ul>
         * <li>Extract this <code>&lt;after&gt;</code> element's <code>CDATA</code> contents
         * from the response.</li>
         * <li>Find the DOM element whose identifier matches <code>after id</code> and insert
         * the <code>&lt;after&gt;</code> element's <code>CDATA</code> content after
         * the DOM element in the document.</li>
         * </ul>
         * </li>
         * </ul>
         * <p><i>Delete Element Processing</i></p>
         * <ul>
         * <li>If a <code>&lt;delete&gt;</code> element is found in the response:
         * <pre><code>&lt;delete id="delete id"/&gt;</code></pre>
         * Find the DOM element whose identifier matches <code>delete id</code> and remove it
         * from the DOM.</li>
         * </ul>
         * <p><i>Element Attribute Update Processing</i></p>
         * <ul>
         * <li>If an <code>&lt;attributes&gt;</code> element is found in the response:
         * <pre><code>&lt;attributes id="id of element with attribute"&gt;
         *    &lt;attribute name="attribute name" value="attribute value"&gt;
         *    ...
         * &lt/attributes&gt;</code></pre>
         * <ul>
         * <li>Find the DOM element that matches the <code>&lt;attributes&gt;</code> identifier.</li>
         * <li>For each nested <code>&lt;attribute&gt;</code> element in <code>&lt;attribute&gt;</code>,
         * update the DOM element attribute value (whose name matches <code>attribute name</code>),
         * with <code>attribute value</code>.</li>
         * </ul>
         * </li>
         * </ul>
         * <p><i>JavaScript Processing</i></p>
         * <ul>
         * <li>If an <code>&lt;eval&gt;</code> element is found in the response:
         * <pre><code>&lt;eval&gt;
         *    &lt;![CDATA[...JavaScript...]]&gt;
         * &lt;/eval&gt;</code></pre>
         * <ul>
         * <li>Extract this <code>&lt;eval&gt;</code> element's <code>CDATA</code> contents
         * from the response and execute it as if it were JavaScript code.</li>
         * </ul>
         * </li>
         * <li class="changed_added_5_0">If a CSP <code>nonce</code> attribute is present on the
         * <code>&lt;script&gt;</code> element that corresponds to the <code>jakarta.faces:faces.js</code>
         * resource, for example:
         * <pre><code>&lt;script
         *     src=".../jakarta.faces.resource/faces.js?ln=jakarta.faces"
         *     nonce="..."&gt;
         * &lt;/script&gt;</code></pre>
         * <ul>
         * <li>Extract this CSP <code>nonce</code> attribute and apply it when executing the JavaScript
         * code so that the browser permits execution.</li>
         * <li>This CSP <code>nonce</code> attribute should also be applied when executing the JavaScript
         * code found in other response elements, such as <code>&lt;update&gt;</code>,
         * <code>&lt;insert&gt;</code> and <code>&lt;extensions&gt;</code>.</li>
         * </ul>
         * </li>
         * </ul>
         * <p><i>Redirect Processing</i></p>
         * <ul>
         * <li>If a <code>&lt;redirect&gt;</code> element is found in the response:
         * <pre><code>&lt;redirect url="redirect url"/&gt;</code></pre>
         * Cause a redirect to the url <code>redirect url</code>.</li>
         * <p><i>Error Processing</i></p>
         * <li>If an <code>&lt;error&gt;</code> element is found in the response:
         * <pre><code>&lt;error&gt;
         *    &lt;error-name&gt;..fully qualified class name string...&lt;error-name&gt;
         *    &lt;error-message&gt;&lt;![CDATA[...]]&gt;&lt;error-message&gt;
         * &lt;/error&gt;</code></pre>
         * Extract this <code>&lt;error&gt;</code> element's <code>error-name</code> contents
         * and the <code>error-message</code> contents. Signal a <code>serverError</code> passing
         * the <code>errorName</code> and <code>errorMessage</code>.  Refer to
         * Jakarta Faces Specification Document section 13.3.6.3 "Signaling Errors".</li>
         * </ul>
         * <p><i>Extensions</i></p>
         * <ul>
         * <li>The <code>&lt;extensions&gt;</code> element provides a way for framework
         * implementations to provide their own information.</li>
         * </ul>
         *
         * @param request The <code>XMLHttpRequest</code> instance that
         * contains the status code and response message from the server.
         * @param context An object containing the request context, including the following properties:
         * the identifier of the source element, per call onerror callback function, and per call onevent callback function.
         * @throws {Error} If request contains no data.
         * @since 2.0
         */
        export function response(request: XMLHttpRequest, context: { sourceid?: string, onerror?: Function, onevent?: Function }): void;
    }

    /**
     *
     * <p>Return the value of <code>Application.getProjectStage()</code> for
     * the currently running application instance.  Calling this method must
     * not cause any network transaction to happen to the server.</p>
     * <p><b>Usage:</b></p>
     * <pre><code>const stage = faces.getProjectStage();
     * 
     * if (stage === 'Development') {
     *     // ...
     * } else if (stage === 'Production') {
     *     // ...
     * }</code></pre>
     *
     * @returns <code>String</code> representing the current state of the
     * running application in a typical product development lifecycle.  Refer
     * to <code>jakarta.faces.application.Application.getProjectStage</code> and
     * <code>jakarta.faces.application.ProjectStage</code>.
     * @since 2.0
     */
    export function getProjectStage(): string;

    /**
     * <p>Collect and encode state for input controls associated
     * with the specified <code>form</code> element.  This will include
     * all input controls of type <code>hidden</code>.</p>
     * <p><b>Usage:</b></p>
     * <pre><code>const state = faces.getViewState(form);</code></pre>
     *
     * @param form The <code>form</code> element whose contained
     * <code>input</code> controls will be collected and encoded.
     * Only successful controls will be collected and encoded in
     * accordance with: <a href="http://www.w3.org/TR/html401/interact/forms.html#h-17.13.2">
     * Section 17.13.2 of the HTML Specification</a>.
     * @returns The encoded state for the specified form's input controls.
     * @since 2.0
     */
    export function getViewState(form: Element): string;
    
    /**
     * <p class="changed_added_2_2">Return the windowId of the window
     * in which the argument form is rendered.</p>
     *
     * @param node Determine the nature of
     * the argument.  If not present, search for the windowId within
     * <code>document.forms</code>.  If present and the value is a
     * string, assume the string is a DOM id and get the element with
     * that id and start the search from there.  If present and the
     * value is a DOM element, start the search from there.
     * @returns The windowId of the current window, or null
     *  if the windowId cannot be determined.
     * @throws {Error} If more than one WindowId is found.
     * @since 2.2
     */
    export function getClientWindow(node?: Element | string): string | null;
    
    /**
     * <p class="changed_added_2_3">
     * The Push functionality.
     * </p>
     * @namespace
     * @since 2.3
     */
    export namespace push {
        
        /**
         * Initialize a websocket on the given client identifier. When connected, it will stay open and reconnect as
         * long as URL is valid and <code>{@link faces.push.close}</code> hasn't explicitly been called on the same client
         * identifier.
         * @param clientId The client identifier of the websocket.
         * @param url The URL of the websocket. All open websockets on the same URL will receive the
         * same push notification from the server.
         * @param channel The channel name of the websocket.
         * @param onopen The JavaScript event handler function that is invoked when the websocket is opened.
         * The function will be invoked with one argument: the channel name.
         * @param onmessage The JavaScript event handler function that is invoked when a message is received from
         * the server. The function will be invoked with three arguments: the push message, the channel name and
         * the raw <code>MessageEvent</code> itself.
         * @param onerror The JavaScript event handler function that is invoked when a connection error has
         * occurred and the web socket will attempt to reconnect. The function will be invoked with three arguments: the
         * error reason code, the channel name and the raw <code>CloseEvent</code> itself. Note that this will not be
         * invoked on final close of the web socket, even when the final close is caused by an error. See also
         * <a href="https://datatracker.ietf.org/doc/html/rfc6455#section-7.4.1">RFC 6455 section 7.4.1</a> and
         * <code>jakarta.websocket.CloseReason.CloseCodes</code> API for an elaborate list of all close codes.
         * @param onclose The function to be invoked when the web socket is closed and will not anymore attempt
         * to reconnect. The function will be invoked with three arguments: the close reason code, the channel name
         * and the raw <code>CloseEvent</code> itself. Note that this will also be invoked when the close is caused by an
         * error and that you can inspect the close reason code if an actual connection error occurred and which one (i.e.
         * when the code is not 1000 or 1008). See also <a href="https://datatracker.ietf.org/doc/html/rfc6455#section-7.4.1">RFC 6455
         * section 7.4.1</a> and <code>jakarta.websocket.CloseReason.CloseCodes</code> API for an elaborate list of all close codes.
         * @param behaviors Client behavior functions to be invoked when specific message is received.
         * @param autoconnect Whether or not to automatically connect the socket. Defaults to <code>false</code>.
         * @since 2.3
         */
        export function init(clientId: string, url: string, channel: string, onopen: Function | string | null, onmessage: Function | string | null, onerror: Function | string | null, onclose: Function | string | null, behaviors: object, autoconnect: boolean): void;

        /**
         * Open the websocket on the given client identifier.
         * @param clientId The client identifier of the websocket.
         * @throws {Error} When client identifier is unknown. You may need to initialize it first via <code>{@link faces.push.init}</code> function.
         * @since 2.3
         */
        export function open(clientId: string): void;

        /**
         * Close the websocket on the given client identifier.
         * @param clientId The client identifier of the websocket.
         * @throws {Error} When client identifier is unknown. You may need to initialize it first via <code>{@link faces.push.init}</code> function.
         * @since 2.3
         */
        export function close(clientId: string): void;
    }

    /**
     * The namespace for Jakarta Faces JavaScript utilities.
     * @namespace
     * @since 2.0
     */
    export namespace util {

        /**
         * <p>A varargs function that invokes an arbitrary number of scripts.
         * If any script in the chain returns false, the chain is short-circuited
         * and subsequent scripts are not invoked.  Any number of scripts may
         * specified after the <code>event</code> argument.</p>
         *
         * @param {Element} source The DOM element that triggered this Ajax request, or an
         * id string of the element to use as the triggering element.
         * @param {Event} event The DOM event that triggered this Ajax request.  The
         * <code>event</code> argument is optional.
         * @returns <code>false</code> if any scripts in the chain return <code>false</code>,
         *  otherwise returns <code>true</code>.
         * @since 2.0
         */
        export function chain(source: Element | string, event?: Event, ...scripts: string[]): boolean;
    }
}
