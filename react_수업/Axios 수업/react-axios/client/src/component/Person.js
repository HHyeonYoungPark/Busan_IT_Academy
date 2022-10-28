function Person({ person }) {
  return (
    <div>
      {/* {person.map((p) => { */}
      {person.map((p, key) => {
        const { id, name, age, image } = p; // const{사용할 변수명} = 객체명 (객체분할)

        return (
          //   <div key={id}>
          <div key={key}>
            <p>
              {/* <img src={p.image} alt={p.name} /> */}
              <p>
                <img src={image} alt={name} />
              </p>
              <h4>{name}</h4>
              <p>{age}</p>
            </p>
          </div>
        );
      })}
    </div>
  );
}

export default Person;
