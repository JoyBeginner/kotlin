/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.di;

import com.intellij.openapi.project.Project;
import org.jetbrains.jet.lang.resolve.BindingTrace;
import org.jetbrains.jet.lang.descriptors.ModuleDescriptor;
import org.jetbrains.jet.lang.resolve.java.JavaBridgeConfiguration;
import org.jetbrains.jet.lang.resolve.java.JavaSemanticServices;
import org.jetbrains.jet.lang.resolve.java.JavaDescriptorResolver;
import org.jetbrains.jet.lang.resolve.java.PsiClassFinderImpl;
import org.jetbrains.jet.lang.resolve.java.provider.PsiDeclarationProviderFactory;
import org.jetbrains.jet.lang.resolve.java.JavaTypeTransformer;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaClassResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaAnnotationResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaCompileTimeConstResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaClassObjectResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaSupertypeResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaFunctionResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaValueParameterResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaSignatureResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.DeserializedDescriptorResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaNamespaceResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaConstructorResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaInnerClassResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaPropertyResolver;
import org.jetbrains.annotations.NotNull;
import javax.annotation.PreDestroy;

/* This file is generated by org.jetbrains.jet.generators.injectors.GenerateInjectors. DO NOT EDIT! */
public class InjectorForJavaDescriptorResolver {
    
    private final Project project;
    private final BindingTrace bindingTrace;
    private final ModuleDescriptor moduleDescriptor;
    private final JavaBridgeConfiguration javaBridgeConfiguration;
    private final JavaSemanticServices javaSemanticServices;
    private final JavaDescriptorResolver javaDescriptorResolver;
    private final PsiClassFinderImpl psiClassFinder;
    private final PsiDeclarationProviderFactory psiDeclarationProviderFactory;
    private final JavaTypeTransformer javaTypeTransformer;
    private final JavaClassResolver javaClassResolver;
    private final JavaAnnotationResolver javaAnnotationResolver;
    private final JavaCompileTimeConstResolver javaCompileTimeConstResolver;
    private final JavaClassObjectResolver javaClassObjectResolver;
    private final JavaSupertypeResolver javaSupertypeResolver;
    private final JavaFunctionResolver javaFunctionResolver;
    private final JavaValueParameterResolver javaValueParameterResolver;
    private final JavaSignatureResolver javaSignatureResolver;
    private final DeserializedDescriptorResolver deserializedDescriptorResolver;
    private final JavaNamespaceResolver javaNamespaceResolver;
    private final JavaConstructorResolver javaConstructorResolver;
    private final JavaInnerClassResolver javaInnerClassResolver;
    private final JavaPropertyResolver javaPropertyResolver;
    
    public InjectorForJavaDescriptorResolver(
        @NotNull Project project,
        @NotNull BindingTrace bindingTrace,
        @NotNull ModuleDescriptor moduleDescriptor
    ) {
        this.project = project;
        this.bindingTrace = bindingTrace;
        this.moduleDescriptor = moduleDescriptor;
        this.javaBridgeConfiguration = new JavaBridgeConfiguration();
        this.javaSemanticServices = new JavaSemanticServices();
        this.javaDescriptorResolver = new JavaDescriptorResolver();
        this.psiClassFinder = new PsiClassFinderImpl();
        this.psiDeclarationProviderFactory = new PsiDeclarationProviderFactory(getPsiClassFinder());
        this.javaTypeTransformer = new JavaTypeTransformer();
        this.javaClassResolver = new JavaClassResolver();
        this.javaAnnotationResolver = new JavaAnnotationResolver();
        this.javaCompileTimeConstResolver = new JavaCompileTimeConstResolver();
        this.javaClassObjectResolver = new JavaClassObjectResolver();
        this.javaSupertypeResolver = new JavaSupertypeResolver();
        this.javaFunctionResolver = new JavaFunctionResolver();
        this.javaValueParameterResolver = new JavaValueParameterResolver();
        this.javaSignatureResolver = new JavaSignatureResolver();
        this.deserializedDescriptorResolver = new DeserializedDescriptorResolver();
        this.javaNamespaceResolver = new JavaNamespaceResolver();
        this.javaConstructorResolver = new JavaConstructorResolver();
        this.javaInnerClassResolver = new JavaInnerClassResolver();
        this.javaPropertyResolver = new JavaPropertyResolver();

        this.javaBridgeConfiguration.setJavaSemanticServices(javaSemanticServices);

        this.javaSemanticServices.setDescriptorResolver(javaDescriptorResolver);
        this.javaSemanticServices.setPsiClassFinder(psiClassFinder);
        this.javaSemanticServices.setPsiDeclarationProviderFactory(psiDeclarationProviderFactory);
        this.javaSemanticServices.setTrace(bindingTrace);
        this.javaSemanticServices.setTypeTransformer(javaTypeTransformer);

        this.javaDescriptorResolver.setClassResolver(javaClassResolver);
        this.javaDescriptorResolver.setConstructorResolver(javaConstructorResolver);
        this.javaDescriptorResolver.setFunctionResolver(javaFunctionResolver);
        this.javaDescriptorResolver.setInnerClassResolver(javaInnerClassResolver);
        this.javaDescriptorResolver.setNamespaceResolver(javaNamespaceResolver);
        this.javaDescriptorResolver.setPropertiesResolver(javaPropertyResolver);

        this.psiClassFinder.setProject(project);

        javaTypeTransformer.setJavaSemanticServices(javaSemanticServices);
        javaTypeTransformer.setResolver(javaDescriptorResolver);

        javaClassResolver.setAnnotationResolver(javaAnnotationResolver);
        javaClassResolver.setClassObjectResolver(javaClassObjectResolver);
        javaClassResolver.setFunctionResolver(javaFunctionResolver);
        javaClassResolver.setKotlinDescriptorResolver(deserializedDescriptorResolver);
        javaClassResolver.setNamespaceResolver(javaNamespaceResolver);
        javaClassResolver.setPsiClassFinder(psiClassFinder);
        javaClassResolver.setSemanticServices(javaSemanticServices);
        javaClassResolver.setSignatureResolver(javaSignatureResolver);
        javaClassResolver.setSupertypesResolver(javaSupertypeResolver);
        javaClassResolver.setTrace(bindingTrace);

        javaAnnotationResolver.setClassResolver(javaClassResolver);
        javaAnnotationResolver.setCompileTimeConstResolver(javaCompileTimeConstResolver);

        javaCompileTimeConstResolver.setAnnotationResolver(javaAnnotationResolver);
        javaCompileTimeConstResolver.setClassResolver(javaClassResolver);

        javaClassObjectResolver.setSemanticServices(javaSemanticServices);
        javaClassObjectResolver.setSupertypesResolver(javaSupertypeResolver);
        javaClassObjectResolver.setTrace(bindingTrace);

        javaSupertypeResolver.setClassResolver(javaClassResolver);
        javaSupertypeResolver.setSemanticServices(javaSemanticServices);
        javaSupertypeResolver.setTrace(bindingTrace);
        javaSupertypeResolver.setTypeTransformer(javaTypeTransformer);

        javaFunctionResolver.setAnnotationResolver(javaAnnotationResolver);
        javaFunctionResolver.setParameterResolver(javaValueParameterResolver);
        javaFunctionResolver.setSignatureResolver(javaSignatureResolver);
        javaFunctionResolver.setTrace(bindingTrace);
        javaFunctionResolver.setTypeTransformer(javaTypeTransformer);

        javaValueParameterResolver.setTypeTransformer(javaTypeTransformer);

        javaSignatureResolver.setJavaSemanticServices(javaSemanticServices);

        deserializedDescriptorResolver.setJavaClassResolver(javaClassResolver);
        deserializedDescriptorResolver.setJavaNamespaceResolver(javaNamespaceResolver);

        javaNamespaceResolver.setJavaSemanticServices(javaSemanticServices);
        javaNamespaceResolver.setPsiClassFinder(psiClassFinder);
        javaNamespaceResolver.setTrace(bindingTrace);

        javaConstructorResolver.setTrace(bindingTrace);
        javaConstructorResolver.setTypeTransformer(javaTypeTransformer);
        javaConstructorResolver.setValueParameterResolver(javaValueParameterResolver);

        javaInnerClassResolver.setClassResolver(javaClassResolver);

        javaPropertyResolver.setAnnotationResolver(javaAnnotationResolver);
        javaPropertyResolver.setJavaSignatureResolver(javaSignatureResolver);
        javaPropertyResolver.setSemanticServices(javaSemanticServices);
        javaPropertyResolver.setTrace(bindingTrace);

        psiClassFinder.initialize();

    }
    
    @PreDestroy
    public void destroy() {
    }
    
    public Project getProject() {
        return this.project;
    }
    
    public BindingTrace getBindingTrace() {
        return this.bindingTrace;
    }
    
    public ModuleDescriptor getModuleDescriptor() {
        return this.moduleDescriptor;
    }
    
    public JavaBridgeConfiguration getJavaBridgeConfiguration() {
        return this.javaBridgeConfiguration;
    }
    
    public JavaSemanticServices getJavaSemanticServices() {
        return this.javaSemanticServices;
    }
    
    public JavaDescriptorResolver getJavaDescriptorResolver() {
        return this.javaDescriptorResolver;
    }
    
    public PsiClassFinderImpl getPsiClassFinder() {
        return this.psiClassFinder;
    }
    
}
