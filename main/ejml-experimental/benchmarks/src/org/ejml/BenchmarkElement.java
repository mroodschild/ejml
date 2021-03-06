/*
 * Copyright (c) 2009-2017, Peter Abeles. All Rights Reserved.
 *
 * This file is part of Efficient Java Matrix Library (EJML).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ejml;

import org.ejml.data.DMatrixRMaj;
import org.ejml.dense.row.CommonOps_DDRM;
import org.ejml.dense.row.RandomMatrices_DDRM;

import java.util.Random;


/**
 * @author Peter Abeles
 */
public class BenchmarkElement {
    static Random rand = new Random(234);

    public static void main( String args[] ) {
        long N = 10000000;

        double num = 2.5;

        DMatrixRMaj A = RandomMatrices_DDRM.rectangle(10,10,rand);

        long timeBefore = System.currentTimeMillis();
        for( int i = 0; i < N; i++ ) {
            CommonOps_DDRM.divide(A,num);
        }
        long timeAfter = System.currentTimeMillis();

        System.out.println("div = "+(timeAfter-timeBefore));

        A = RandomMatrices_DDRM.rectangle(10,10,rand);

        timeBefore = System.currentTimeMillis();
        for( int i = 0; i < N; i++ ) {
            CommonOps_DDRM.scale(num,A);
        }
        timeAfter = System.currentTimeMillis();

        System.out.println("scale = "+(timeAfter-timeBefore));
    }
}
