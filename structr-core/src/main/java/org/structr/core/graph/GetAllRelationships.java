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
package org.structr.core.graph;

import java.util.Collections;
import java.util.List;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.tooling.GlobalGraphOperations;
import org.structr.common.error.FrameworkException;
import org.structr.core.entity.AbstractRelationship;

/**
 * Fetches all the relationships in the database.
 *
 * @author Axel Morgner
 */
public class GetAllRelationships extends NodeServiceCommand {

	public List<AbstractRelationship> execute() throws FrameworkException {

		RelationshipFactory relationshipFactory = new RelationshipFactory(securityContext);
		GraphDatabaseService graphDb            = (GraphDatabaseService)arguments.get("graphDb");

		if(graphDb != null) {
			
			return relationshipFactory.instantiateRelationships(securityContext, GlobalGraphOperations.at(graphDb).getAllRelationships());
		}

		return Collections.emptyList();
	}
}
