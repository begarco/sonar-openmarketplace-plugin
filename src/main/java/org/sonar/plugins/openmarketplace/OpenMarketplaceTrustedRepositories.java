/*
 * Open Marketplace plugin for SonarQube
 * Copyright (C) 2018-2019 ivangalkin
 * http://github.com/ivangalkin
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.plugins.openmarketplace;

public class OpenMarketplaceTrustedRepositories {

  public static final String ORIGINAL_REPOSITORY_URL = "https://update.sonarsource.org/update-center.properties";
  public static final String OPENMARKETPLACE_REPOSITORY_URL = "https://raw.githubusercontent.com/ivangalkin/sonar-openmarketplace-plugin/master/update-center.properties";

  private OpenMarketplaceTrustedRepositories() {
  }
}
