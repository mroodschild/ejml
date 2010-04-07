/*
 * Copyright (c) 2009-2010, Peter Abeles. All Rights Reserved.
 *
 * This file is part of Efficient Java Matrix Library (EJML).
 *
 * EJML is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 *
 * EJML is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with EJML.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.ejml.alg.generic;

import org.ejml.data.DenseD2Matrix64F;
import org.ejml.data.DenseMatrix64F;
import org.ejml.data.Matrix64F;


/**
 * @author Peter Abeles
 */
public class CopyMatrix {

    public static DenseD2Matrix64F convertToD2( DenseMatrix64F orig ) {
        DenseD2Matrix64F ret = new DenseD2Matrix64F(orig.numRows,orig.numCols);

        copy(orig,ret);

        return ret;
    }

    public static void copy( Matrix64F from , Matrix64F to )
    {
        int numCols = from.getNumCols();
        int numRows = from.getNumRows();

        for( int i = 0; i < numRows; i++ ) {
            for( int j = 0; j < numCols; j++ ) {
                to.set(i,j,from.get(i,j));
            }
        }
    }
}
