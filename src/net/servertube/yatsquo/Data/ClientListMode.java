/*
 * Copyright (C) 2013 Sebastian "prodigy" Grunow <sebastian.gr at servertube.net>.
 *
 * ClientListMode.java - 2012-08-29
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
package net.servertube.yatsquo.Data;

/**
 *
 * @author Sebastian "prodigy" Grunow <sebastian.gr at servertube.net>
 */
public enum ClientListMode {

  CLIENT_LIST("clientlist"),
  DB_CLIENT_LIST("clientdblist");

  private String command;

  private ClientListMode(String command) {
    this.command = command;
  }

  public String getCommand() {
    return command;
  }
}
