function Company(props) {
  return (
    <div>
      <h1>Welcome {props.title}</h1>
      <p>{props.contents}</p>
    </div>
  );
}

export default Company;
