package com.aor.numbers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;




public class ListAggregatorTest {

    private List<Integer> list = new ArrayList<>();

    @Before
    public void createL(){
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);

    }

    @Test
    public void sum() {

        ListAggregator aggregator = new ListAggregator(list);

        int sum = aggregator.sum();

        assertEquals(14, sum);
    }

    @Test
    public void max() {

        ListAggregator aggregator = new ListAggregator(list);

        int max = aggregator.max();

        assertEquals(-1, max);
    }



    @Test
    public void min() {

        ListAggregator aggregator = new ListAggregator(list);

        int min = aggregator.min();

        assertEquals(1, min);
    }

    @Test
    public void distinct() {

        class ListDeduplicatorMock implements IListDeduplicator{

            @Override
            public List<Integer> deduplicate() {
                List<Integer> h = new ArrayList<>();
                h.add(1);
                h.add(2);
                h.add(4);
                return h;
            }
        }

        ListAggregator aggregator = new ListAggregator(list);

        //int distinct = aggregator.distinct();
        int distinct = aggregator.distinct(new ListDeduplicatorMock());


        assertEquals(3, distinct);
    }
}