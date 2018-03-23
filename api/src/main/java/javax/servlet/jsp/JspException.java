/*
 * Copyright (c) 1997-2018 Oracle and/or its affiliates. All rights reserved.
 * Copyright 2004 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package javax.servlet.jsp;

/**
 * A generic exception known to the JSP engine; uncaught
 * JspExceptions will result in an invocation of the errorpage
 * machinery.
 */

public class JspException extends Exception {

    /**
     * Construct a JspException.
     */
    public JspException() {
    }


    /**
     * Constructs a new JSP exception with the
     * specified message. The message can be written 
     * to the server log and/or displayed for the user. 
     *
     * @param msg 		a <code>String</code> 
     *				specifying the text of 
     *				the exception message
     *
     */
    public JspException(String msg) {
	super(msg);
    }


    /**
     * Constructs a new <code>JspException</code> with the specified detail
     * message and cause.
     *
     * The cause is saved for later retrieval by the
     * {@link #getCause()} and {@link #getRootCause()} methods.
     *
     * @see java.lang.Exception#Exception(String, Throwable)
     */
    public JspException(String message, Throwable cause) {
	super(message, cause);
    }


    /**
     * Constructs a new <code>JspException</code> with the specified cause.
     *
     * The cause is saved for later retrieval by the
     * {@link #getCause()} and {@link #getRootCause()} methods.
     *
     * @see java.lang.Exception#Exception(Throwable)
     */
    public JspException(Throwable cause) {
	super(cause);
    }

    
    /**
     * Returns the exception that caused this JSP exception.
     *
     * @return			the <code>Throwable</code> 
     *				that caused this JSP exception
     *
     * @deprecated As of JSP 2.1, replaced by {@link #getCause()}
     */
    
    public Throwable getRootCause() {
	return getCause();
    }
}
