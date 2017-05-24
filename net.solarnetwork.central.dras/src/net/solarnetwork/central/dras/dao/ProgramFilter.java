/* ==================================================================
 * ProgramFilter.java - Jun 10, 2011 3:55:10 PM
 * 
 * Copyright 2007-2011 SolarNetwork.net Dev Team
 * 
 * This program is free software; you can redistribute it and/or 
 * modify it under the terms of the GNU General Public License as 
 * published by the Free Software Foundation; either version 2 of 
 * the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License 
 * along with this program; if not, write to the Free Software 
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 
 * 02111-1307 USA
 * ==================================================================
 */

package net.solarnetwork.central.dras.dao;

import net.solarnetwork.central.domain.Filter;

/**
 * {@link Filter} for {@link net.solarnetwork.central.dras.domain.Program}
 * objects.
 * 
 * @author matt
 * @version 1.0
 */
public interface ProgramFilter extends UserAwareFilter {

	/**
	 * Get a program name.
	 * 
	 * @return the name
	 */
	String getName();
	
}
