/* ==================================================================
 * DelegatingEventAdminBiz.java - Jun 23, 2011 3:31:17 PM
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

package net.solarnetwork.central.dras.biz.support;

import net.solarnetwork.central.dras.biz.EventAdminBiz;
import net.solarnetwork.central.dras.domain.EffectiveCollection;
import net.solarnetwork.central.dras.domain.Event;
import net.solarnetwork.central.dras.domain.Member;
import net.solarnetwork.central.dras.support.MembershipCommand;

/**
 * Delegating {@link EventAdminBiz}, to support AOP with OSGi services.
 * 
 * @author matt
 * @version 1.0
 */
public class DelegatingEventAdminBiz implements EventAdminBiz {

	private EventAdminBiz delegate;

	/**
	 * Construct with delegate.
	 * 
	 * @param delegate the delegate
	 */
	public DelegatingEventAdminBiz(EventAdminBiz delegate) {
		this.delegate = delegate;
	}
	
	@Override
	public Event storeEvent(Event template) {
		return delegate.storeEvent(template);
	}

	@Override
	public EffectiveCollection<Event, Member> assignMembers(Long eventId,
			MembershipCommand participants, MembershipCommand participantGroups) {
		return delegate.assignMembers(eventId, participants, participantGroups);
	}

}
