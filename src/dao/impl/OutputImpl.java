package dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import dao.OutputDAO;
import fallback.DefaultInput;
import spi.Output;

public class OutputImpl implements OutputDAO {

  private final List<Output> outputProviders;

  public OutputImpl() {
    outputProviders = new ArrayList<>();
    ServiceLoader.load(Output.class).forEach(outputProviders::add);
    if (outputProviders.size() == 0) {
      outputProviders.add(new DefaultInput());
    }
  }

  @Override
  public void print(String msg) {
    outputProviders.forEach(e -> e.print(msg));
  }
}
