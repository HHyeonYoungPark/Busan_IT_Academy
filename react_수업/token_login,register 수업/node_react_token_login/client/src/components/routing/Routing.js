import React from "react";
import { Routes, Route } from "react-router-dom";
import Login from "../../components/pages/page/Login";
import Register from "../../components/pages/page/Register";
import Profile from "../../components/pages/page/Profile";
import Logout from "../../components/pages/page/Logout";
import Home from "../../components/pages/page/Home";
import PrivateRoute from "./PrivateRoute";

const Routing = ({ user }) => {
  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/login" element={<Login />} />
      <Route path="/logout" element={<Logout />} />
      <Route path="/register" element={<Register />} />

      {/* Outlet 페이지를 사용하기위해서는 Rout(복수가능) */}
      {/* 토큰여부에 따라서 처리 */}
      <Route element={<PrivateRoute user={user} />}>
        {/* 부모밑에 있는거 Oulet */}
        <Route path="/profile" element={<Profile />} />
      </Route>
    </Routes>
  );
};

export default Routing;
