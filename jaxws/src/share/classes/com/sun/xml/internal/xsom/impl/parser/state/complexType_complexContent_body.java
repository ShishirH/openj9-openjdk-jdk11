/*
 * Copyright 2005-2006 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */
/* this file is generated by RelaxNGCC */
package com.sun.xml.internal.xsom.impl.parser.state;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.Attributes;
import com.sun.xml.internal.xsom.impl.parser.NGCCRuntimeEx;

    import com.sun.xml.internal.xsom.*;
    import com.sun.xml.internal.xsom.parser.*;
    import com.sun.xml.internal.xsom.impl.*;
    import com.sun.xml.internal.xsom.impl.parser.*;
    import org.xml.sax.Locator;
    import org.xml.sax.ContentHandler;
    import org.xml.sax.helpers.*;
    import java.util.*;



class complexType_complexContent_body extends NGCCHandler {
    private AttributesHolder owner;
    protected final NGCCRuntimeEx $runtime;
    private int $_ngcc_current_state;
    protected String $uri;
    protected String $localName;
    protected String $qname;

    public final NGCCRuntime getRuntime() {
        return($runtime);
    }

    public complexType_complexContent_body(NGCCHandler parent, NGCCEventSource source, NGCCRuntimeEx runtime, int cookie, AttributesHolder _owner) {
        super(source, parent, cookie);
        $runtime = runtime;
        this.owner = _owner;
        $_ngcc_current_state = 2;
    }

    public complexType_complexContent_body(NGCCRuntimeEx runtime, AttributesHolder _owner) {
        this(null, runtime, runtime, -1, _owner);
    }

    private void action0()throws SAXException {
        if(particle==null)
          particle = $runtime.parser.schemaSet.empty;
}

    public void enterElement(String $__uri, String $__local, String $__qname, Attributes $attrs) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 0:
            {
                revertToParentFromEnterElement(particle, super._cookie, $__uri, $__local, $__qname, $attrs);
            }
            break;
        case 1:
            {
                if((($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("attribute")) || (($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("attributeGroup")) || ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("anyAttribute"))))) {
                    NGCCHandler h = new attributeUses(this, super._source, $runtime, 676, owner);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    NGCCHandler h = new attributeUses(this, super._source, $runtime, 676, owner);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        case 2:
            {
                if((($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("group")) || (($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("any")) || (((($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("all")) || ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("choice"))) || ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("sequence"))) || ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("element")))))) {
                    NGCCHandler h = new particle(this, super._source, $runtime, 678);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    $_ngcc_current_state = 1;
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        default:
            {
                unexpectedEnterElement($__qname);
            }
            break;
        }
    }

    public void leaveElement(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 0:
            {
                revertToParentFromLeaveElement(particle, super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 1:
            {
                NGCCHandler h = new attributeUses(this, super._source, $runtime, 676, owner);
                spawnChildFromLeaveElement(h, $__uri, $__local, $__qname);
            }
            break;
        case 2:
            {
                $_ngcc_current_state = 1;
                $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        default:
            {
                unexpectedLeaveElement($__qname);
            }
            break;
        }
    }

    public void enterAttribute(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 0:
            {
                revertToParentFromEnterAttribute(particle, super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 1:
            {
                NGCCHandler h = new attributeUses(this, super._source, $runtime, 676, owner);
                spawnChildFromEnterAttribute(h, $__uri, $__local, $__qname);
            }
            break;
        case 2:
            {
                $_ngcc_current_state = 1;
                $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        default:
            {
                unexpectedEnterAttribute($__qname);
            }
            break;
        }
    }

    public void leaveAttribute(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 0:
            {
                revertToParentFromLeaveAttribute(particle, super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 1:
            {
                NGCCHandler h = new attributeUses(this, super._source, $runtime, 676, owner);
                spawnChildFromLeaveAttribute(h, $__uri, $__local, $__qname);
            }
            break;
        case 2:
            {
                $_ngcc_current_state = 1;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        default:
            {
                unexpectedLeaveAttribute($__qname);
            }
            break;
        }
    }

    public void text(String $value) throws SAXException {
        int $ai;
        switch($_ngcc_current_state) {
        case 0:
            {
                revertToParentFromText(particle, super._cookie, $value);
            }
            break;
        case 1:
            {
                NGCCHandler h = new attributeUses(this, super._source, $runtime, 676, owner);
                spawnChildFromText(h, $value);
            }
            break;
        case 2:
            {
                $_ngcc_current_state = 1;
                $runtime.sendText(super._cookie, $value);
            }
            break;
        }
    }

    public void onChildCompleted(Object $__result__, int $__cookie__, boolean $__needAttCheck__)throws SAXException {
        switch($__cookie__) {
        case 676:
            {
                action0();
                $_ngcc_current_state = 0;
            }
            break;
        case 678:
            {
                particle = ((ParticleImpl)$__result__);
                $_ngcc_current_state = 1;
            }
            break;
        }
    }

    public boolean accepted() {
        return(($_ngcc_current_state == 0));
    }


      private ContentTypeImpl particle;

}
