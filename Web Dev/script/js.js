var clicked = false;
//common FOR TASK and BUG

function tskchangeval(oo){
 if(!clicked){
  clicked = true;
  oo.style="background-color:blue";
  oo.innerHTML="Suspend";
 }
 else{
  if(!clicked)
  clicked= false;
  alert("You have clicked more than 1 button!?");
 }
}


function bugchangeval(ok){
  var kiki=ok.parentNode.parentNode.lastChild.previousSibling.querySelector('#breason').value;
  var rem=ok.parentNode.parentNode.lastChild.querySelector('#bremarks').value;  
  var bugid=ok.parentNode.parentNode.firstChild.nextSibling.nextSibling.innerHTML;
  var reg=/\&/i;

  if(!clicked){
    clicked = true;
    ok.style="background-color:blue";
    ok.innerHTML="Suspend";

  
    
  }
  else{
    if(ok.innerHTML=="Suspend"){
      if(!rem){
        alert("Pls enter remarks");
      }
      else if(kiki == ''){
        alert("Pls enter option ");
      }
      else if(reg.test(rem)){
        alert("No special characters allowed");
      }
      else{
        if(kiki=='Completed'){
          window.location=('form.php');
        }
        else{
          window.location="tsk.php?remarks="+rem+"&bug="+bugid+"&Status="+status;   
        }
      }
    } 
    else{
    if(!clicked)
    clicked= false;
    alert("You have clicked more than 1 button !?");
    }
  }
}


//FOR TASK
function tsksel(ob){
  if(ob.parentNode.parentNode.firstChild.nextSibling.innerText=='Suspend'){
  var val=ob.value;
  var sel=ob.parentNode.parentNode.firstChild.nextSibling.nextSibling.innerHTML;
  alert(sel);
  window.location="pmctsk.php?tsk="+sel+"&select="+val;
  } 
  else{
    ob.selectedIndex = "0";
  }
}

//FOR BUG
function bugsel(obj){
  if(obj.parentNode.parentNode.firstChild.nextSibling.innerText !='Suspend'){
      obj.selectedIndex = "0"; 
  }
}




