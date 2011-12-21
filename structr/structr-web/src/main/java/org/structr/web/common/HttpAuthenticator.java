/*
 *  Copyright (C) 2011 Axel Morgner
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

package org.structr.web.common;

import javax.servlet.http.HttpServletRequest;
import org.structr.common.SecurityContext;
import org.structr.core.auth.AuthenticationException;
import org.structr.core.auth.Authenticator;
import org.structr.core.entity.SuperUser;
import org.structr.core.entity.User;

/**
 *
 * @author Christian Morgner
 */
public class HttpAuthenticator implements Authenticator {

	@Override
	public void setSecurityContext(SecurityContext securityContext) {
	}

	@Override
	public User doLogin(HttpServletRequest request, String userName, String password) throws AuthenticationException {
		return getUser(request);
	}

	@Override
	public void doLogout(HttpServletRequest request) {
	}

	@Override
	public User getUser(HttpServletRequest request) {
		return new SuperUser();
	}
}