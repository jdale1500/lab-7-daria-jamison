package edu.luc.cs271.linkedstack;
//small
import java.util.List;
import java.util.ArrayList;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // Done why don't we need an explicit constructor? Linked list has already been implemented

  @Override //done
  public E push(final E obj) {
    top = new Node<> (obj, top);
    return obj;
  }

  @Override
  public E peek() {
    // Done
    if(isEmpty()) {
      throw new NoSuchElementException();
    }
    else {
      return top.data
    }
  }

  @Override
  public E pop() {
    // Done
    if (isEmpt()) {
      throw new NoSuchElementException();
    }
    else {
      E done = top.data;
      top = top.next;
      size = 1;
      return done;
    }
  }

  @Override
  public boolean isEmpty() {
    // TODO
    return false;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size
    // TODO add any instance variable(s) required to support this
    return null;
  }
}
