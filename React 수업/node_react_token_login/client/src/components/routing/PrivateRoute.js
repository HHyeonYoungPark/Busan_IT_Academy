import React from "react";
import { Navigate, Outlet } from "react-router-dom";

const PrivateRoute = ({ user }) => {
  // token 값이 있으면 Routing.js의 자식 페이지 내용을 보여줘야 하는데
  // 자식 페이지 보여주는 router 태그는 <Outlet />
  // 토큰이 없으면 navigate를 이용해서 페이지 이동
  return user ? <Outlet /> : <Navigate to="/login" />;
};

export default PrivateRoute;
