package org.wbw.networksearch.abstractgraphs;

public abstract class AbstractSearcher {

	// given a graph, and end point to reach, and a list of paths that all start from the 
    // from the start point to extend, finds the number of paths meet the given criteria
	//
	// Inputs:
	// - graph
	// - end point to try and reach
	// - list of (valid) paths that start from the start point to extend
	// - Set of the helper objects listed below
	//
	//
	// Outputs (eventually, first version just counts events)
	//
	// Path Information
	// - number of valid paths found to end point
	// - average, min, and max complete path length
	// - number of dead ends reached during search
	// - time required for the search
	// - average, min, and max length of dead end paths found
	//
	// Resources used
	// - number of starting paths
	// - total number of paths submitted to the criteria for judgement
	// - total number of paths queued for further processing
	// - maximum queue length reached
	// - number of StringBuilders allocated during the search
	// - number of StringBuilders that are reused
	//
	//
	// Helper Objects
	// - AbstractPathExtender - path extender
	// - AbstractPathEvaluator - valid path criteria judge
	// - AbstractWorkQueue - work queue - either LIFO or FIFO
	// - AbstractSBprovider - StringBuilder provider
	// - AbstractEvent counter
	//
	// Events
	// - search started (time)
	// - search ended (time)
	// - startPathQueued
	// - StringBuilder allocated
	// - StringBuilder returned for reuse
	// - path dequeued from work queue
	// - path queued for further work
	// - path criteria evaluated
	//
	//
	// Flow:of SearchMaster
	// 1.  SearchMaster creates the searcher and all helper objects
	// 2.  The searchMaster configures the searcher with the graph, starter paths list, and helper objects
	// 3.  The searchMaster starts the searcher
	// 4.  When the search is done, the searchMaster tells the eventCounter to print out
	//     the search results.
	//
	//
	// Flow of Searcher
	// 1. The searcher configures each helper object based on what it has been given.
	// 2. The searcher puts the start path list to the workQueue
	// 3. While the work queue is not empty, the searcher calls the pathExtender to dequeue
	//    a path from the work queue and extend it
	// 4. When the work queue is empty, the searcher quits
	// 5. At the start of each cycle, tell the counter
	//
	//
	// Flow of PathExtender
	// 1. Get a path from the work queue
	// 2. Get a list of "reachable" vertices from the graph from the end of the current path
	// 3. For each possible edge, Ask the PathJudge to judge the path for each of the possible edges
	// 4. If an edge can be followed but it is not the end, get a new StringBuilder, put the extended path in it and put it on the work queue
	// 5. If adding an edge completes the path, tell the event counter and give the StringBuffer to the SBProvider for recycling
	// 6. If no edges can be added to the current path (it can't be extended), tell the EventCounter 
	//    that this is a dead end and return the SB to the SBProvider for reuse
	// 5.5 Report statistics on deadends, incomplete new paths, and comple paths found in the cycle
	// 7. Return to the Searcher
	//
	//
	// Flow of WorkQueue
	// 1. When a new start path is added to the queue, tell the counter
	// 2. When a "not done" path is added, tell the counter.
	// 3. When a "not done" path is put on the queue, tell the counter
	// 4. If this is a "depth" first workqueue, practice LIFO
	// 5. If this is a breadth first workqueue, practice FIFO
	// 6. When a new SB is put on the queue, tell the event counter the size of the queue (with the new one) and the
	//    length of the SB put on
	// 
	// Flow of EventCounter
	// 1. Get called with an "statistic" name and a count
	// 2. Keep a total of each time a statistic is given and the min, max, and total of the counts given
	// 3. When called to print out, print out all "statistics" along with the number of times it was given, and the min, max, total, 
	//    and average value of he counts
	//
	//
	// Flow of SBProvider
	// 1. When called for new SB, allocate one and tell the EC
	// 2. When an SB is returned, tell the EC of the return and give it the size of the SB returned
	//
	//
	// Flow of PathJudge
	// 1. When called, render a judgement and tell the EC you were called and the size of the path (without new edge) you were given
	

}
