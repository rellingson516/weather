/*
 * Subject.java 1.0 Sept 10, 2015
 *
 * Copyright (c) 2015 HFDP
 */
package headfirst.seniorstudent1;

public interface Subject {

  public void notifyObservers();

  public void registerObserver(Observer o);

  public void removeObserver(Observer o);
}
