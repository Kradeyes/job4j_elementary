package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class JobTest {

    private Job job1 = new Job("Impl task", 0);
    private Job job2 = new Job("Fix bug", 1);
    private Job job3 = new Job("Fix bug", 0);

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
    public void whenAscByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        List<Job> rsl = Arrays.asList(job1, job2, job3);
        Collections.sort(rsl, cmpNamePriority);
        List<Job> rslexp = Arrays.asList(job3, job2, job1);
        assertEquals(rslexp, rsl);
    }

    @Test
    public void whenDescByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        List<Job> rsl = Arrays.asList(job1, job2, job3);
        Collections.sort(rsl, cmpNamePriority);
        List<Job> rslexp = Arrays.asList(job1, job2, job3);
        assertEquals(rslexp, rsl);
    }


    @Test
    public void whenAscByNameAndDescPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobDescByPriority());
        List<Job> rsl = Arrays.asList(job1, job2, job3);
        Collections.sort(rsl, cmpNamePriority);
        List<Job> rslexp = Arrays.asList(job2, job3, job1);
        assertEquals(rslexp, rsl);
    }

    @Test
    public void whenDescByNameAndAscPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobAscByPriority());
        List<Job> rsl = Arrays.asList(job1, job2, job3);
        Collections.sort(rsl, cmpNamePriority);
        List<Job> rslexp = Arrays.asList(job1, job3, job2);
        assertEquals(rslexp, rsl);
    }
}

