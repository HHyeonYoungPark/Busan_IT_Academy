function popupOpen(url, nick, width, height) {
  let screen = "";
  let left = (screen.availWidth - width) / 2;
  let top = (screen.availHeight - height) / 2;
  //alert(top);
  //alert(left);
  /*window.open(자식파일이름,별명,옵션)*/
  // window.open("./10-child_pop.html", "", ""); 버튼누르면 parent창뜸

  // left = 300, top = 500, width = 300, height = 100
  screen =
    "left=" + left + ", top=" + top + ", width=" + width + ", height=" + height;
  window.open(url, nick, screen);
}
