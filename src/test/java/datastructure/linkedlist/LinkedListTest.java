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
        assertThat(linkedList.size()).isEqualTo(1);
        assertThat(linkedList.getHead().getData()).isEqualTo("first");
        assertThat(linkedList.getHead().getNext()).isNull();
        assertThat(linkedList.getTail().getData()).isEqualTo("first");
        assertThat(linkedList.getTail().getNext()).isNull();
    }

    @Test
    public void addFirst() {
        linkedList.addFirst("second");
        assertThat(linkedList.size()).isEqualTo(2);
        assertThat(linkedList.getHead().getData()).isEqualTo("second");
        assertThat(linkedList.getHead().getNext()).isNotNull();
        assertThat(linkedList.getHead().getNext().getData()).isEqualTo("first");
        assertThat(linkedList.getTail().getData()).isEqualTo("first");
    }

    @Test
    public void addLastOnlyOne() {
        assertThat(linkedList.size()).isEqualTo(1);
        assertThat(linkedList.getTail().getData()).isEqualTo("first");
        assertThat(linkedList.getTail().getNext()).isNull();
        assertThat(linkedList.getHead().getData()).isEqualTo("first");
        assertThat(linkedList.getHead().getNext()).isNull();
    }

    @Test
    public void addLast() {
        linkedList.addLast("second");
        assertThat(linkedList.size()).isEqualTo(2);
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
        linkedList.getNode(linkedList.size());
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

    @Test
    public void get() {
        assertThat(linkedList.get(0)).isEqualTo("first");
    }

    @Test
    public void deleteFirstOnlyOne() {
        linkedList.deleteFirst();
        assertThat(linkedList.size()).isEqualTo(0);
    }

    @Test
    public void deleteFirst() {
        linkedList.addLast("second");
        linkedList.deleteFirst();
        assertThat(linkedList.size()).isEqualTo(1);
        assertThat(linkedList.getHead().getData()).isEqualTo("second");
    }

    @Test
    public void deleteLastOnlyOne() {
        linkedList.deleteLast();
        assertThat(linkedList.size()).isEqualTo(0);
        assertThat(linkedList.getTail()).isNull();
    }

    @Test
    public void deleteLast() {
        linkedList.addLast("second");
        linkedList.deleteLast();
        assertThat(linkedList.size()).isEqualTo(1);
        assertThat(linkedList.getTail().getData()).isEqualTo("first");
        assertThat(linkedList.getTail().getNext()).isNull();
    }
}