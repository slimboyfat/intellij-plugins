package com.google.jstestdriver.idea.assertFramework.jstd.generate;

import org.jetbrains.annotations.NotNull;

public class JstdGenerateTearDownAction extends AbstractJstdCreateStaticMethodAction {
  @NotNull
  @Override
  public String getHumanReadableDescription() {
    return "JsTestDriver TearDown";
  }

  @NotNull
  @Override
  public String getMethodName() {
    return "tearDown";
  }
}