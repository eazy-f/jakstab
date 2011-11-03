/*
 * DualCompositeProgramAnalysis.java - This file is part of the Jakstab project.
 * Copyright 2011 Johannes Kinder <jk@jakstab.org>
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, see <http://www.gnu.org/licenses/>.
 */
package org.jakstab.analysis.composite;

import org.jakstab.analysis.AbstractState;
import org.jakstab.analysis.ConfigurableProgramAnalysis;
import org.jakstab.analysis.location.LocationAnalysis;

/**
 * @author Johannes Kinder
 *
 */
public class DualCompositeAnalysis extends CompositeProgramAnalysis {

	public DualCompositeAnalysis(LocationAnalysis locationAnalysis,
			ConfigurableProgramAnalysis... otherCPAs) {
		super(locationAnalysis, otherCPAs);
	}

	@Override
	protected CompositeState createCompositeState(AbstractState[] components) {
		return new DualCompositeState(components);
	}

}