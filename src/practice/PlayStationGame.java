package practice;

import java.util.Optional;
import java.util.Set;

import org.graalvm.compiler.debug.Indent;

import com.google.common.graph.ElementOrder;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.Graph;
import com.google.common.graph.Network;

import utilities.Base;

public class PlayStationGame extends Base implements TestInter, Network<N, E>, Indent{
// you can extend only one class and then implemented other metods like tesInter, Network
	@Override
	public void turnOn() { // now you can put your code over here
		System.out.println("This will turn on the game");
		//now I'm implementing all those to my game 
		//now you understand what interface is and why it use
		//dont create in object from interface but you can create object from the class
		//interface is just contract you made with this class 
		
	}

	@Override
	public void goUP() {
		System.out.println("the Player jumps");
	}

	@Override
	public void goDown() {// |-put like this when doest have any items
		System.out.println("The Player sits");
		
	}

	@Override
	public Set<E> adjacentEdges(E arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<N> adjacentNodes(N arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean allowsParallelEdges() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean allowsSelfLoops() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Graph<N> asGraph() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int degree(N arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<E> edgeConnecting(N arg0, N arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E edgeConnectingOrNull(N arg0, N arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ElementOrder<E> edgeOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<E> edges() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<E> edgesConnecting(N arg0, N arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasEdgeConnecting(N arg0, N arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int inDegree(N arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<E> inEdges(N arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<E> incidentEdges(N arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EndpointPair<N> incidentNodes(E arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isDirected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ElementOrder<N> nodeOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<N> nodes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int outDegree(N arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<E> outEdges(N arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<N> predecessors(N arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<N> successors(N arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E edgeConnectingOrNull(N arg0, N arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E edgeConnectingOrNull(N arg0, N arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E edgeConnectingOrNull(N arg0, N arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E edgeConnectingOrNull(N arg0, N arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
