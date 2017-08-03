package CtCi.TreesAndGraphs;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by tuxedo21 on 4/05/17.
 */
public class RouteBetweenNodes {


    public static void main(String[] args) {

        SimpleGraph graph = new SimpleGraph(50);
        String s0="0";String s1="1";String s2="2";String s3="3";String s4="4";String s5="5";String s6="6";String s7="7";String s8="8";String s9="9";String s10="10";String s11="11";String s12="12";String s13="13";String s14="14";String s15="15";String s16="16";String s17="17";String s18="18";String s19="19";String s20="20";String s21="21";String s22="22";String s23="23";String s24="24";
        String s25="25";String s26="26";String s27="27";String s28="28";String s29="29";String s30="30";String s31="31";String s32="32";String s33="33";String s34="34";String s35="35";String s36="36";String s37="37";String s38="38";String s39="39";String s40="40";String s41="41";String s42="42";String s43="43";String s44="44";String s45="45";String s46="46";String s47="47";String s48="48";String s49="49";
        graph.insertVertex(0,s0);graph.insertVertex(1,s1);graph.insertVertex(2,s2);graph.insertVertex(3,s3);graph.insertVertex(4,s4);graph.insertVertex(5,s5);graph.insertVertex(6,s6);graph.insertVertex(7,s7);graph.insertVertex(8,s8);graph.insertVertex(9,s9);graph.insertVertex(10,s10);graph.insertVertex(11,s11);graph.insertVertex(12,s12);graph.insertVertex(13,s13);graph.insertVertex(14,s14);graph.insertVertex(15,s15);graph.insertVertex(16,s16);graph.insertVertex(17,s17);graph.insertVertex(18,s18);graph.insertVertex(19,s19);graph.insertVertex(20,s20);graph.insertVertex(21,s21);graph.insertVertex(22,s22);graph.insertVertex(23,s23);graph.insertVertex(24,s24);
        graph.insertVertex(25,s25);graph.insertVertex(26,s26);graph.insertVertex(27,s27);graph.insertVertex(28,s28);graph.insertVertex(29,s29);graph.insertVertex(30,s30);graph.insertVertex(31,s31);graph.insertVertex(32,s32);graph.insertVertex(33,s33);graph.insertVertex(34,s34);graph.insertVertex(35,s35);graph.insertVertex(36,s36);graph.insertVertex(37,s37);graph.insertVertex(38,s38);graph.insertVertex(39,s39);graph.insertVertex(40,s40);graph.insertVertex(41,s41);graph.insertVertex(42,s42);graph.insertVertex(43,s43);graph.insertVertex(44,s44);graph.insertVertex(45,s45);graph.insertVertex(46,s46);graph.insertVertex(47,s47);graph.insertVertex(48,s48);graph.insertVertex(49,s49);


        graph.insertEdge(0,1);
        graph.insertEdge(0,3);
        graph.insertEdge(1,2);
        graph.insertEdge(1,3);
        graph.insertEdge(2,1);
        graph.insertEdge(3,4);
        graph.insertEdge(4,0);
        graph.insertEdge(4,3);

        for(int i =0; i < 50; i++){
            System.out.println("Vertex " + i+ "\'s");
            graph.showVertex(i);
            //System.out.println("its routes are: ");
           // graph.showEdges(i);
        }

    }

}
