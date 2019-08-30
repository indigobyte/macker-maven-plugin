package de.andrena.tools.macker.plugin;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;

/**
 * Runs Macker against the compiled classes of the project.
 *
 * @requiresProject
 * @author <a href="http://www.codehaus.org/~wfay/">Wayne Fay</a>
 * @author <a href="http://people.apache.org/~bellingard/">Fabrice Bellingard</a>
 * @author <a href="http://www.code-cop.org/">Peter Kofler</a>
 */
@Mojo(
        name = "macker",
        defaultPhase = LifecyclePhase.COMPILE,
        requiresDependencyResolution = ResolutionScope.COMPILE,
        requiresProject = true
)
public class MackerMojo
        extends AbstractMackerMojo
{

    @Override
    protected Macker createMackerImplementation()
    {
        return new ForkedMacker();
    }
}
