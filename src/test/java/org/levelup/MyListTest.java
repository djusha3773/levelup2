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

        assertEquals(false,myList.remove((Object)Integer.valueOf(7)));
    }

}

