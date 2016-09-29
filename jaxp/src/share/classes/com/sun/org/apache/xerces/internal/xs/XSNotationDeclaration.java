/*
 * reserved comment block
 * DO NOT REMOVE OR ALTER!
 */
/*
 * Copyright 2003,2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sun.org.apache.xerces.internal.xs;

/**
 *  This interface represents the Notation Declaration schema component.
 */
public interface XSNotationDeclaration extends XSObject {
    /**
     *  The URI reference representing the system identifier for the notation
     * declaration, if present, <code>null</code> otherwise.
     */
    public String getSystemId();

    /**
     *  The string representing the public identifier for this notation
     * declaration, if present; <code>null</code> otherwise.
     */
    public String getPublicId();

    /**
     * An [annotation] if it exists, otherwise <code>null</code>.
     */
    public XSAnnotation getAnnotation();

}
