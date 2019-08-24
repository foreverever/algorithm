package datastructure.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LinkedListTest {
    private LinkedList linkedList;

    @Before
    public void setUp() throws Exception {
        linkedList = new LinkedList();
        linkedList.addFirst("first");
    }

    @Test
    public void addFirstOnlyOne() {
        assertThat(linkedList.getSize()).isEqualTo(1);
        assertThat(linkedList.getHead().getData()).isEqualTo("first");
        assertThat(linkedList.getHead().getNext()).isNull();
        assertThat(linkedList.getTail().getData()).isEqualTo("first");
        assertThat(linkedList.getTail().getNext()).isNull();
    }

    @Test
    public void addFirst() {
        linkedList.addFirst("second");
        assertThat(linkedList.getSize()).isEqualTo(2);
        assertThat(linkedList.getHead().getData()).isEqualTo("second");
        assertThat(linkedList.getHead().getNext()).isNotNull();
        assertThat(linkedList.getHead().getNext().getData()).isEqualTo("first");
        assertThat(linkedList.getTail().getData()).isEqualTo("first");
    }

    @Test
    public void addLastOnlyOne() {
        assertThat(linkedList.getSize()).isEqualTo(1);
        assertThat(linkedList.getTail().getData()).isEqualTo("first");
        assertThat(linkedList.getTail().getNext()).isNull();
        assertThat(linkedList.getHead().getData()).isEqualTo("first");
        assertThat(linkedList.getHead().getNext()).isNull();
    }

    @Test
    public void addLast() {
        linkedList.addLast("second");
        assertThat(linkedList.getSize()).isEqualTo(2);
        assertThat(linkedList.getTail().getData()).isEqualTo("second");
        assertThat(linkedList.getHead().getData()).isEqualTo("first");
    }

    @Test
    public void getNodeOnlyOne() {
        assertThat(linkedList.getNode(0).getData()).isEqualTo("first");
    }

    @Test
    public void getNode() {
        linkedList.addLast("second");
        linkedList.addLast("third");
        assertThat(linkedList.getNode(2).getData()).isEqualTo("third");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getNodeOverSizeIndex() {
        linkedList.getNode(linkedList.getSize());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getNodeMinusIndex() {
        linkedList.getNode(-1);
    }

    @Test
    public void add() {
        linkedList.addLast("second");
        linkedList.add(1,"mid");
        assertThat(linkedList.getNode(1).getData()).isEqualTo("mid");
        assertThat(linkedList.getTail().getData()).isEqualTo("second");
    }
}