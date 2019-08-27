package datastructure.queue;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueueTest {
    private Queue q;

    @Before
    public void setUp() throws Exception {
        q = new Queue();
    }

    @Test
    public void push() {
        q.push("first");
        assertThat(q.size()).isEqualTo(1);
    }

    @Test(expected = NullPointerException.class)
    public void popEmpty() {
        q.pop();
    }

    @Test
    public void pop() {
        q.push("first");
        assertThat(q.size()).isEqualTo(1);
        q.pop();
        assertThat(q.size()).isEqualTo(0);
    }

    @Test(expected = NullPointerException.class)
    public void frontEmpty() {
        q.front();
    }

    @Test
    public void front() {
        q.push("first");
        assertThat(q.front()).isEqualTo("first");
    }

    @Test
    public void empty() {
        assertThat(q.empty()).isTrue();
        q.push("first");
        assertThat(q.empty()).isFalse();
    }

    @Test
    public void totalTest() {
        for (int i = 0; i < 10; i++) {
            q.push(Integer.toString(i));
        }
        assertThat(q.size()).isEqualTo(10);
        assertThat(q.front()).isEqualTo("0");
        q.pop();
        assertThat(q.size()).isEqualTo(9);
        assertThat(q.front()).isEqualTo("1");
        while (!q.empty()) q.pop();
        assertThat(q.empty()).isTrue();
    }
}