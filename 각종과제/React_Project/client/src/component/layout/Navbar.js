import React from "react";
import { Link, NavLink } from "react-router-dom";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { famagnifyingglass } from "@fortawesome/free-solid-svg-icons";

function Navbar() {
  return (
    <>
      <nav className="nav-wrap">
        <div className="nav-logo">
          <h1>
            <Link to="/" className="logo">
              경남문화재단
            </Link>
          </h1>
        </div>
        <div className="nav-menu">
          <ul>
            <li>
              <NavLink to="/">문화재</NavLink>
            </li>
            <li>
              <NavLink to="tour">문화관광</NavLink>
            </li>
            <li>
              <NavLink to="business">주요사업</NavLink>
            </li>
            <li>
              <NavLink to="openinfo">정보공개</NavLink>
            </li>
            <li>
              <NavLink to="introduction">재단소개</NavLink>
            </li>
            <li>
              <NavLink to="notice">알림마당</NavLink>
            </li>
          </ul>
        </div>
        <div className="nav-right">
          <Link to="search">검색</Link>
          <Link to="sitemap">사이트맵</Link>
        </div>
      </nav>
      <div className="subVisual">
        <div className="subTitle">
          <h2></h2>
        </div>
      </div>
    </>
  );
}

export default Navbar;
