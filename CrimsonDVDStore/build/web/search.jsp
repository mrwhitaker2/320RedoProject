<%-- 
    Document   : search
    Created on : Apr 9, 2017, 3:06:28 PM
    Author     : mrwhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
    </head>
    <body>
        <form name="myform">
            <table>
                <tr>
                    <td>
                        <h1>Search for a film here:</h1>
                        <select id="DropDownList1" name="search" >
                            <option value="">Select...
                            <option value="1">Category/Genre
                            <option value="2">Actor Name
                            <option value="3">Rating
                        </select> 

                        <select id="DropDownList2" name="genreSearch" >
                            <option value="">Select a Genre...
                            <option value="1">Action 
                            <option value="2">Animation
                            <option value="3">Children
                            <option value="4">Classics
                            <option value="5">Comedy
                            <option value="6">Documentary
                            <option value="7">Drama
                            <option value="8">Family
                            <option value="9">Foreign
                            <option value="10">Games
                            <option value="11">Horror
                            <option value="12">Music
                            <option value="13">New
                            <option value="14">Sci-Fi
                            <option value="15">Sports
                            <option value="16">Travel
                        </select> 
                        <select id="DropDownList3" name="actorSearch" >
                            <option value="">Select an Actor...
                            <option value="1">Akroyd 
                            <option value="2">Astaire
                            <option value="3">Bailey
                            <option value="4">Barrymore
                            <option value="5">Bergen
                            <option value="6">Berry
                            <option value="7">Bloom
                            <option value="8">Bolger
                            <option value="9">Bridges
                            <option value="10">Brody
                            <option value="11">Cage
                            <option value="12">Chaplin
                            <option value="13">Chase
                            <option value="14">Costner
                            <option value="15">Crawford
                            <option value="16">Cronyn
                            <option value="17">Cruise
                            <option value="18">Cruz
                            <option value="19">Damon
                            <option value="20">Davis
                            <option value="21">Day-Lewis
                            <option value="22">Dean
                            <option value="23">Degeneres
                            <option value="24">Depp
                            <option value="25">Dukakis
                            <option value="26">Fawcett
                            <option value="27">Gable
                            <option value="28">Goldberg
                            <option value="29">Grant
                            <option value="30">Guiness
                            <option value="31">Hackman
                            <option value="32">Harris
                            <option value="33">Hawke
                            <option value="34">Hoffman
                            <option value="35">Hopkins
                            <option value="36">Hudson 
                            <option value="37">Hunt 
                            <option value="38">Johansson 
                            <option value="39">Jolie 
                            <option value="40">Jovovich 
                            <option value="41">Keitel 
                            <option value="42">Kilmer 
                            <option value="43">Lollobrigida 
                            <option value="44">Marx 
                            <option value="45">Mcconaughey 
                            <option value="46">Mckellen 
                            <option value="47">Mcqueen 
                            <option value="48">Miranda 
                            <option value="49">Mostel 
                            <option value="50">Neeson 
                            <option value="51">Nicholson 
                            <option value="52">Olivier 
                            <option value="53">Paltrow 
                            <option value="54">Peck 
                            <option value="55">Penn 
                            <option value="56">Pesci
                            <option value="57">Phoenix
                            <option value="58">Pinkett
                            <option value="59">Pitt
                            <option value="60">Posey
                            <option value="61">Presley
                            <option value="62">Sinatra
                            <option value="63">Sobieski
                            <option value="64">Stallone
                            <option value="65">Streep
                            <option value="66">Swank
                            <option value="67">Tandy
                            <option value="68">Tautou
                            <option value="69">Temple
                            <option value="70">Torn
                            <option value="71">Tracy
                            <option value="72">Voight
                            <option value="73">Wahlberg
                            <option value="74">Wayne
                            <option value="75">Williams
                            <option value="76">Willis
                            <option value="77">Winslet
                            <option value="78">Wood
                            <option value="79">Wray
                            <option value="80">Zellweger
                        </select>  
                        
                        <select id="DropDownList4" name="ratingSearch" >
                            <option value="">Select a Rating...
                            <option value="1">G 
                            <option value="2">PG
                            <option value="3">PG-13
                            <option value="4">R
                            <option value="5">NC-17                   
                        </select>   
                        <input type="submit" value="Search" name="search_btn">  
                    </td>
                </tr>
            </table>

    </body>
</html>
