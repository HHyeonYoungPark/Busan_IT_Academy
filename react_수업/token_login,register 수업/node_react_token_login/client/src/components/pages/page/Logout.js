import React, { useEffect } from "react";

const Logout = () => {
  useEffect(() => {
    // localStorage.removeItem("token"); //하나만
    localStorage.clear(); //전체
    window.location = "/";
  }, []);
};

export default Logout;
