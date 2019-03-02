let Links = {
  setColor: function(color) {
    // let aList = document.querySelectorAll('a');
    // let i = 0;
    // while (i < aList.length) {
    //   aList[i].style.color = color;
    //   i = i + 1;
    // }

    $('a').css('color', color);
  }
};




let Body = {
  setColor: function(color) {
    // document.querySelector('body').style.color = color;
    $('body').css('color', color);
  },
  setBackgroundColor : function(color) {
    // document.querySelector('body').style.backgroundColor = color;
    $('body').css('backgroundColor', color);
  }
};





function nightDayHandler(self) {
  if (self.value === 'night') {
    Body.setBackgroundColor('black');
    Body.setColor('white');
    self.value = 'day';

    Links.setColor('yellow');


  } else {
    Body.setBackgroundColor('white');
    Body.setColor('black');
    self.value = 'night';

    Links.setColor('blue')
  }
}

