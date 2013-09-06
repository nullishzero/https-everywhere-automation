/* Automation framework for testing the firefox extension "HTTPS Everywhere."
 * Copyright (C) 2013 Pavel Kazakov
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.httpse.automation;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

// Place holder class
public class App {
    private final Options options;
    private final CommandLine cmd;

    private void addOptions() {
        // TODO: Print help, finish etc.
        // TODO: Move to optionbuilder
        options.addOption("help", false, "still in the works..");
    }

    private CommandLine parseOptions(final String[] args) {
        try {
            CommandLineParser parser = new BasicParser();
            return parser.parse(options, args);
        } catch (Exception e) {
            // TODO: Properly handle
            e.printStackTrace();
            return null;
        }
    }

    // disallow external instances
    private App(final String[] args) {
        this.options = new Options();
        addOptions();
        this.cmd = parseOptions(args);
    }
    
    public static void main(String[] args) {
        App app = new App(args);
    }
}
