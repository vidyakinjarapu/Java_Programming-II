/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidya
 */
public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    //Adding an element to the list
    public void add(Type value) {
        if(this.firstFreeIndex == this.values.length) {
            grow();
        }        
        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }
    
    //To increase the size of a list if we want to add extra elements than size
    
    private void grow() {
        int newSize = this.values.length + (this.values.length / 2);
        Type[] newValues = (Type[]) new Object[newSize];
        for(int i = 0;i < this.values.length;i++) {
            newValues[i] = this.values[i];
        }
        
        this.values = newValues;
    }
    
    //Checking whether a list contain a particular element
    public boolean contains(Type value) {
        return indexOfValue(value) >= 0;
        
//        for (int i = 0; i < this.firstFreeIndex; i++) {
//            if (this.values[i].equals(value)) {
//                return true;
//            }
//        }
//
//        return false;
    }
    
    //Removing an element and changing positions of an element
    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return; // not found
        }

        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }

    public int indexOfValue(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
    
    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }
    
    //returning a value based on index value
    public Type value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
        return this.values[index];
    }
    
    //Finding size of a list
    public int size() {
        return this.firstFreeIndex;
    }
}
