package org.levelup;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.Assert.assertEquals;

/**
 * Created by my on 17.07.17.
 */
public class MyListTest<E>  {

    private MyList<Integer> myList= new  MyList<Integer>();

    @Before
    public void clean(){
        myList= new  MyList<Integer>();
        System.out.println("Clean");
    }
    @Test
    public void add()
    {
        myList.add(5);
        myList.add(1);

        assertEquals(false,myList.add(7));
        assertEquals(true,myList.add(5));
    }

    @Test
    public void remove()
    {
        myList.add(5);
        myList.add(1);

        assertEquals(false,myList.remove(Integer.valueOf(7)));
        assertEquals(true,myList.remove(Integer.valueOf(5)));
        assertEquals(false,myList.remove(Integer.valueOf(5)));
    }


    @Test
    public void get()
    {
        myList.add(7);
        myList.add(3);

        assertEquals(Integer.valueOf(7),myList.get(0));
        assertEquals(Integer.valueOf(3),myList.get(1));
        assertEquals(null,myList.get(2));

    }
    @Test
    public void size()
    {
        myList.add(1);
        assertEquals(1,myList.size());

        myList.add(5);
        assertEquals(2,myList.size());


    }

    @Test
    public void isEmpty()
    {
        assertEquals(true,myList.isEmpty());

        myList.add(5);
        assertEquals(false,myList.isEmpty());


    }

}

