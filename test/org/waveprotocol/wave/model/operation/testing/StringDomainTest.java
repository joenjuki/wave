/**
 * Copyright 2009 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.waveprotocol.wave.model.operation.testing;

import junit.framework.TestCase;

import org.waveprotocol.wave.model.operation.testing.DomainRandomTester.FailureException;
import org.waveprotocol.wave.model.operation.testing.DomainRandomTester.Log;

public class StringDomainTest extends TestCase {

  private final int NUM_ITERATIONS = 100;
  DomainRandomTester<StringDomain.Data, StringDomain.StringOp> t;

  boolean expectFailure = false;

  public void testDataOpEquivalence() {
    createTester();
    t.testDataOperationEquivalence(NUM_ITERATIONS);
  }
//
//  public void testInversion() {
//    createTester();
//    t.testOperationInversion(NUM_ITERATIONS);
//  }

  public void testCompose() {
    createTester();
    t.testCompositionOnInitialState(NUM_ITERATIONS);
    t.testCompositionAssociativity(NUM_ITERATIONS);
    t.testSimpleComposition(NUM_ITERATIONS);
  }

  public void testTransform() {
    createTester();
    t.testTransformDiamondProperty(NUM_ITERATIONS);
  }

  protected void createTester() {
    StringDomain d = new StringDomain();
    StringOpGenerator g = new StringOpGenerator();
    createTester(d, g);
  }

  protected void createTester(StringDomain d, StringOpGenerator g) {
    t = new DomainRandomTester<StringDomain.Data, StringDomain.StringOp>(new Log() {
        @Override
        public void inconsistent(String... lines) {
          if (!expectFailure) {
            for (String line : lines) {
              System.err.println(line);
            }
          }
          throw new FailureException();
        }

        @Override
        public void fatal(Throwable exception, String... lines) {
          for (String line : lines) {
            System.err.println(line);
          }
          fail("EXCEPTION THROWN");
        }

        @Override
        public void info(String... lines) {
          for (String line : lines) {
            System.out.println(line);
          }
        }
      }, d, g);
  }
}
