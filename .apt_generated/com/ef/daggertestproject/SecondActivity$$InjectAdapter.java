// Code generated by dagger-compiler.  Do not edit.
package com.ef.daggertestproject;


import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binder<SecondActivity>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code SecondActivity} and its
 * dependencies.
 *
 * Being a {@code Provider<SecondActivity>} and handling creation and
 * preparation of object instances.
 *
 * Being a {@code MembersInjector<SecondActivity>} and handling injection
 * of annotated fields.
 */
public final class SecondActivity$$InjectAdapter extends Binding<SecondActivity>
    implements Provider<SecondActivity>, MembersInjector<SecondActivity> {
  private Binding<CoolModule> coolModule;
  private Binding<BaseActivity> supertype;

  public SecondActivity$$InjectAdapter() {
    super("com.ef.daggertestproject.SecondActivity", "members/com.ef.daggertestproject.SecondActivity", NOT_SINGLETON, SecondActivity.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    coolModule = (Binding<CoolModule>) linker.requestBinding("com.ef.daggertestproject.CoolModule", SecondActivity.class, getClass().getClassLoader());
    supertype = (Binding<BaseActivity>) linker.requestBinding("members/com.ef.daggertestproject.BaseActivity", SecondActivity.class, getClass().getClassLoader(), false, true);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(coolModule);
    injectMembersBindings.add(supertype);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<SecondActivity>}.
   */
  @Override
  public SecondActivity get() {
    SecondActivity result = new SecondActivity();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<SecondActivity>}.
   */
  @Override
  public void injectMembers(SecondActivity object) {
    object.coolModule = coolModule.get();
    supertype.injectMembers(object);
  }
}