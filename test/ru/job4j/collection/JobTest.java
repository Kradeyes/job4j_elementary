package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenAscByName() {
    Comparator<Job> test = new JobAscByName();
    int rsl = test.compare(
            new Job("Impl task", 0),
            new Job("Fix bug", 1)
    );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenAscByPriority() {
        Comparator<Job> test = new JobAscByPriority();
        int rsl = test.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }


    @Test
    public void whenDescByName() {
        Comparator<Job> test = new JobDescByName();
        int rsl = test.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }


    @Test
    public void whenDescByPriority() {
        Comparator<Job> test = new JobDescByPriority();
        int rsl = test.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenAscByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenAscByNameAndDescPrority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenDescByNameAndAscPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}

