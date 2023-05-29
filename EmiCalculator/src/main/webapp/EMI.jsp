<html>
<head>
    <script src="jquery.js"></script>
    <script>
    $(document).ready(function(){

        $("#homeloan").click(function() {
            $("#emi").toggle(1000);
        });
                });
     $(document).ready(function(){

             $("#carloan").click(function() {
                 $("#emi1").toggle(1000);
             });
                     });
       $(document).ready(function(){

                   $("#personalloan").click(function() {
                       $("#emi2").toggle(1000);
                   });
                           });
</script>
    <style>
h2 {
  color: black;
  margin: 20px 10px 0px;
  padding: 0px 30px 0px 30px;
  text-align: center;
}
.homeloan{
    height:50px;
    width:120px;
}
.carloan{
     height:50px;
     width:120px;
 }
.PersonalLoan{
     height:50px;
     width:120px;
 }

</style>

</head>
<body>
<h2> EMI Calculator for Home Loan, Car Loan & Personal Loan</h2>
<br>
<br>
<button class ="personalloan" id ="personalloan">Personal Loan </button>
<button class="homeloan" id = "homeloan">Home Loan</button>
<button class="carloan" id ="carloan">Car Loan</button>
<form action="EmiCalculator/HomeLoan/EMI" method="post" id="emi">
    <h3>Enter Principal Amount for HomeLoan : <input type="text" name="principal"/></h3>
    <h3>Enter Interest Rate for HomeLoan : <input type="text" name="Interest"/></h3>
    <h3>Enter Tenure(months) : <input type="number" name="Tenure"/></h3>
    <input type="Submit" value = "calculate">
</form>

<form action="EmiCalculator/CarLoan/EMI" method="post" id="emi1">
    <h3>Enter Principal Amount for CarLoan : <input type="text" name="principal1"/></h3>
    <h3>Enter Interest Rate of CarLoan : <input type="text" name="Interest1"/></h3>
    <h3>Enter Tenure(months) : <input type="number" name="Tenure1"/></h3>
    <input type="Submit" value = "calculate">
</form>

<form action="EmiCalculator/personalloan/EMI" method="post" id="emi2">
    <h3>Enter Principal Amount for PersonalLoan : <input type="text" name="principal2"/></h3>
    <h3>Enter Interest Rate of PersonalLoan : <input type="text" name="Interest2"/></h3>
    <h3>Enter Tenure(months) : <input type="number" name="Tenure2"/></h3>
    <input type="Submit" value = "calculate">
</form>
<br>
</body>
</html>












