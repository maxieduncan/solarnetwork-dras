/* ==================================================================
 * UserAwareFilter.java - Jun 23, 2011 7:18:17 PM
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
 * Base filter to help restrict filters based on a user ID.
 * 
 * @author matt
 * @version 1.0
 */
public interface UserAwareFilter extends Filter {

	/**
	 * Get the user ID to filter on.
	 * @return the user ID
	 */
	Long getUserId();
	
	/**
	 * Set the user ID to filter on.
	 * 
	 * @param userId the user ID
	 */
	void setUserId(Long userId);
	
}
