/*
 * Copyright (C) 2013 Sebastian "prodigy" Grunow <sebastian.gr at servertube.net>.
 *
 * QueryEventExecutioner.java - 2012-08-29
 *
 * YATSQUO is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * YATSQUO is distributed in the hope that it will
 * be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with YATSQUO; If not, see
 * <http://www.gnu.org/licenses/>.
 */
package net.servertube.yatsquo;

import net.servertube.yatsquo.Data.EventType;
import java.util.HashMap;

/**
 *
 * @author Sebastian "prodigy" Grunow <sebastian.gr at servertube.net>
 */
public interface QueryEventExecutioner {

  /**
   * Executes the event raised giving the event type and data<br />
   * Override this function and create the QueryInterface<br />
   * with your own QueryListener as parameter.
   *
   * @param type
   * @param data
   */
    public void executeEvent(EventType type, HashMap<String, String> data);
}
