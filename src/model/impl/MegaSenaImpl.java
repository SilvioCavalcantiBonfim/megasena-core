package model.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import exception.*;
import model.MegaSena;

public class MegaSenaImpl implements MegaSena {

  private final Set<Integer> chose = new HashSet<>();
  private final Set<Integer> drawn = new HashSet<>();
  private final int minValue;
  private final int maxValue;
  private final int total;

  public MegaSenaImpl(int min, int max, int total){
    this.minValue = min;
    this.maxValue = max;
    this.total = total;
  }
  
  @Override
  public void addInChose(int value) throws OffBoundException, IllegalNumberException, SizeLimitExceededException{
    validate(chose, value);
    chose.add(value);
  }

  @Override
  public void addInDrawn(int value) throws OffBoundException, IllegalNumberException, SizeLimitExceededException{
    validate(drawn, value);
    drawn.add(value);
  }

  private void validate(Set<Integer> set, int value){
    if (set.size() >= total) {
      throw new SizeLimitExceededException();
    }
    if ((value < minValue || value > maxValue)) {
      throw new OffBoundException();
    }
    if(set.contains(value)){
      throw new IllegalNumberException();
    }
  }

  @Override
  public short result() throws CompleteFillChosenException, CompleteFillDrawnException{
    
    if(chose.size() != total){
      throw new CompleteFillChosenException();
    }
    
    if (!isCompleteFill()) {
      throw new CompleteFillDrawnException();
    }

    short result = (short) chose.stream().filter((e) -> drawn.contains(e)).count();
    return result;
  }

  @Override
  public boolean isCompleteFill(){
    return chose.size() == total;
  }

  @Override
  public Set<Integer> getDrawn() {
    return Collections.unmodifiableSet(drawn);
  }

  @Override
  public Set<Integer> getChosen() {
    return Collections.unmodifiableSet(chose);
  }
  
}
