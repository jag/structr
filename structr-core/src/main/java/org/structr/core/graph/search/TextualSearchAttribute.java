/*
 *  Copyright (C) 2010-2013 Axel Morgner, structr <structr@structr.org>
 * 
 *  This file is part of structr <http://structr.org>.
 * 
 *  structr is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  structr is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with structr.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.structr.core.graph.search;

import org.structr.core.property.PropertyKey;
import org.structr.core.graph.NodeAttribute;

/**
 * Represents an attribute for textual search, used in {@link SearchNodeCommand}.
 *
 * @author Axel Morgner
 */
public class TextualSearchAttribute extends SearchAttribute {

    private NodeAttribute nodeAttribute;

    public TextualSearchAttribute(final PropertyKey key, final String value, final SearchOperator searchOp) {
        nodeAttribute = new NodeAttribute(key, value);
        setSearchOperator(searchOp);
    }

    @Override
    public Object getAttribute() {
        return nodeAttribute;
    }

    @Override
    public void setAttribute(Object attribute) {
        this.nodeAttribute = (NodeAttribute) attribute;
    }

    public PropertyKey getKey() {
        return nodeAttribute.getKey();
    }

    public String getValue() {
        return (String) nodeAttribute.getValue();
    }

}
