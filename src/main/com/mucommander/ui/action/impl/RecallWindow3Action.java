/*
 * This file is part of muCommander, http://www.mucommander.com
 * Copyright (C) 2002-2012 Maxence Bernard
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.mucommander.ui.action.impl;

import com.mucommander.ui.action.MuAction;
import com.mucommander.ui.main.MainFrame;

import java.util.Map;

/**
 * Recalls window number 3 (brings it to the front).
 *
 * @author Maxence Bernard
 */
public class RecallWindow3Action extends RecallWindowAction {

    public RecallWindow3Action(MainFrame mainFrame, Map<String, Object> properties) {
        super(mainFrame, properties, 3);
    }


    public static final class Descriptor extends RecallWindowAction.Descriptor {
        public static final String ACTION_ID = RecallWindowAction.Descriptor.ACTION_ID+"3";

        public Descriptor() {
            super(3);
        }

        public MuAction createAction(MainFrame mainFrame, Map<String,Object> properties) {
            return new RecallWindow3Action(mainFrame, properties);
        }
    }
}
