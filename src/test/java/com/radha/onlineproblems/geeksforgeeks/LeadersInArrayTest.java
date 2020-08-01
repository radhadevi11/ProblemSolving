package com.radha.onlineproblems.geeksforgeeks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeadersInArrayTest {

    @Test
    public void getLeadersWithSameNumbers() {
        LeadersInArray leaders = new LeadersInArray();
        assertThat(leaders.getLeaders( new int[] {7, 4, 5, 7, 3}))
                .containsExactly(7, 7, 3);
    }

    @Test
    public void getLeaders() {
        LeadersInArray leaders = new LeadersInArray();
        assertThat(leaders.getLeaders( new int[] {16, 17, 4, 3, 5, 2}))
                .containsExactly(17, 5, 2);
    }

    @Test
    public void isLeader() {
        LeadersInArray leaders = new LeadersInArray();
        assertThat(leaders.isLeader(17, 1, new int[] {16, 17, 4, 3, 5, 2}))
                .isEqualTo(true);
    }
    @Test
    public void isNotLeader() {
        LeadersInArray leaders = new LeadersInArray();
        assertThat(leaders.isLeader(3, 3, new int[] {16, 17, 4, 3, 5, 2}))
                .isEqualTo(false);
    }

    @Test
    public void testGetLeaderLessTimeComplexity() {
        LeadersInArray leaders = new LeadersInArray();
        assertThat(leaders.getLeadersLessTimeComplexity(new int[] {16, 17, 4, 3, 5, 2}))
                .containsExactly(17, 5, 2);
    }

    @Test
    public void testGetLeaderRepeatedElementsLessTimeComplexity() {
        LeadersInArray leaders = new LeadersInArray();
        assertThat(leaders.getLeadersLessTimeComplexity(new int[] {16, 17, 4, 17, 5, 2}))
                .containsExactly(17,17, 5, 2);
    }
}