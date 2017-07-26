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

package org.ejml.sparse.csc.factory;

import org.ejml.data.DMatrixRMaj;
import org.ejml.data.DMatrixSparseCSC;
import org.ejml.sparse.FillReducing;
import org.ejml.sparse.LinearSolverSparse;
import org.ejml.sparse.csc.decomposition.chol.CholeskyUpLooking_DSCC;
import org.ejml.sparse.csc.linsol.chol.LinearSolverCholesky_DSCC;

/**
 * Factory for sparse linear solvers
 *
 * @author Peter Abeles
 */
public class LinearSolverFactory_DSCC {
    public LinearSolverSparse<DMatrixSparseCSC,DMatrixRMaj> cholesky(FillReducing permutation) {
        CholeskyUpLooking_DSCC chol = new CholeskyUpLooking_DSCC(permutation);
        return new LinearSolverCholesky_DSCC(chol);
    }
}
