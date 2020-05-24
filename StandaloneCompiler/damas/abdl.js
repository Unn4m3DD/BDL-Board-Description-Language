import ABDLVar from "./AbdlVar.js"
var context;
var table;
var render;
const sleep = (milliseconds) => {
  return new Promise(resolve => setTimeout(resolve, milliseconds))
}
const range = (a, b) => {
  const result = [];
  for (let i = a.getValue(); i <= b.getValue(); i++) result.push(new ABDLVar(i));
  return result;
}
const getName = (a) => {
  try {
    return new ABDLVar(context.board[a.getValue()[0]][a.getValue()[1]].piece.name)
  } catch (e) {
    return new ABDLVar("");
  }
}
const getOwner = (a) => {
  try {
    return new ABDLVar(context.board[a.getValue()[0]][a.getValue()[1]].piece.owner)
  } catch (e) {
    return new ABDLVar(-1);
  }
}
const move = async (origin, destination) => {
  try {
    table[origin.getValue()[0]][origin.getValue()[1]].onclick();
    render(context, table)
    await sleep(1);
    table[destination.getValue()[0]][destination.getValue()[1]].onclick();
    render(context, table)
    return new ABDLVar(1);
  } catch (e) {
    return new ABDLVar(0);
  }
}
const can_move = async (origin, destination) => {
  let result
  try{
    if (!table[origin.getValue()[0]][origin.getValue()[1]].onclick) return new ABDLVar(0);
      table[origin.getValue()[0]][origin.getValue()[1]].onclick();
  } catch(e) { return new ABDLVar(0); }
  render(context, table)
  try {
    if (
      table[destination.getValue()[0]][destination.getValue()[1]].style.backgroundColor ==
      "rgb(100, 200, 100)"
    )//rgb(100, 200, 100)
      result = new ABDLVar(1);
    else
      result = new ABDLVar(0);
  } catch (e) { result = new ABDLVar(0); }
  context.focused.x = -1;
  context.focused.y = -1;
  render(context, table);
  return result
}
export default {
  on_move: async (arg_context, arg_table, arg_render) => {
      let v181 = new ABDLVar(context.current_player);
      let v182 = new ABDLVar(0);
      let v180 = v181.equal(v182);
      if (v180.getValue() != 0) {
         let v183 = new ABDLVar( await f5());
      }
      else {
         let v184 = new ABDLVar( await f0());
      }
    },
  main: async (arg_context, arg_table, arg_render) => {
    context = arg_context;
    table = arg_table;
    render = arg_render;
    let v179 = new ABDLVar( await f5());
  }
}
async function f0(){
  let v1 = new ABDLVar(0);
  let v3 = new ABDLVar(context.height);
  let v4 = new ABDLVar(1);
  let v2 = v3.sub(v4);
  let v0 = new ABDLVar([v1, v2]);
  let v5 = v0;
  let v8 = new ABDLVar(context.width);
  let v9 = new ABDLVar(1);
  let v7 = v8.sub(v9);
  let v10 = new ABDLVar(0);
  let v6 = new ABDLVar([v7, v10]);
  let v11 = v6;
  let v14 = new ABDLVar(context.width);
  let v15 = new ABDLVar(1);
  let v13 = v14.sub(v15);
  let v16 = new ABDLVar(0);
  let v12 = new ABDLVar([v13, v16]);
  let v17 = v12;
  let v20 = new ABDLVar(context.width);
  let v21 = new ABDLVar(1);
  let v19 = v20.sub(v21);
  let v22 = new ABDLVar(0);
  let v18 = new ABDLVar([v19, v22]);
  let v23 = v18;
  let v26 = new ABDLVar(context.width);
  let v27 = new ABDLVar(1);
  let v25 = v26.sub(v27);
  let v28 = new ABDLVar(0);
  let v24 = new ABDLVar([v25, v28]);
  let v29 = v24;
  let v30 = new ABDLVar(0);
  let v32 = new ABDLVar(context.width);
  let v33 = new ABDLVar(1);
  let v31 = v32.sub(v33);
  for(let v34 of range(v30,v31)) {
    let v35 = new ABDLVar(0);
    let v37 = new ABDLVar(context.height);
    let v38 = new ABDLVar(1);
    let v36 = v37.sub(v38);
    for(let v39 of range(v35,v36)) {
      let v41 = new ABDLVar([v34, v39]);
      let v42 = new ABDLVar(1);
      let v40 = (getOwner(v41)).equal(v42);
      if (v40.getValue() != 0) {
         let v43 = new ABDLVar([v34, v39]);
         let v44 = (await f1(v43, v5));
         let v45 = new ABDLVar([v34, v39]);
         let v46 = (await f2(v45, v5));
         let v47 = (await f3(v44, v5)).less_than((await f3(v11, v5)));
         if (v47.getValue() != 0) {
            v11 = v44;
            let v48 = new ABDLVar([v34, v39]);
            v23 = v48;
         }
         let v49 = (await f3(v46, v5)).less_than((await f3(v17, v5)));
         if (v49.getValue() != 0) {
            v17 = v46;
            let v50 = new ABDLVar([v34, v39]);
            v29 = v50;
         }
      }
    }
  }
  let v51 = v23.not_equal(v11);
  if (v51.getValue() != 0) {
     let v54 = new ABDLVar(" -> ");
     let v53 = v23.add(v54);
     let v52 = v53.add(v11);
     console.log(v52.toString());
     await move(v23, v11);
  }
  else {
     let v57 = new ABDLVar(" -> ");
     let v56 = v17.add(v57);
     let v55 = v56.add(v17);
     console.log(v55.toString());
     await move(v17, v17);
  }
}
async function f1(v58, v59){
  let v62 = new ABDLVar(context.width);
  let v63 = new ABDLVar(1);
  let v61 = v62.sub(v63);
  let v64 = new ABDLVar(0);
  let v60 = new ABDLVar([v61, v64]);
  let v65 = v60;
  let v66 = new ABDLVar(-2);
  let v67 = new ABDLVar(2);
  for(let v68 of range(v66,v67)) {
    let v69 = new ABDLVar(-2);
    let v70 = new ABDLVar(2);
    for(let v71 of range(v69,v70)) {
      let v73 = new ABDLVar([v68, v71]);
      let v72 = v58.add(v73);
      if ((await can_move(v58, v72)).getValue() != 0) {
         let v76 = new ABDLVar([v68, v71]);
         let v75 = v58.add(v76);
         let v74 = (await f3(v75, v59)).less_than((await f3(v65, v59)));
         if (v74.getValue() != 0) {
            let v79 = new ABDLVar([v68, v71]);
            let v78 = v58.add(v79);
            let v77 = (await f3(v78, v59)).less_than((await f3(v58, v59)));
            if (v77.getValue() != 0) {
               let v81 = new ABDLVar([v68, v71]);
               let v80 = v58.add(v81);
               v65 = v80;
            }
         }
      }
    }
  }
  return v65;
}
async function f2(v82, v83){
  let v86 = new ABDLVar(context.width);
  let v87 = new ABDLVar(1);
  let v85 = v86.sub(v87);
  let v88 = new ABDLVar(0);
  let v84 = new ABDLVar([v85, v88]);
  let v89 = v84;
  let v90 = new ABDLVar(-2);
  let v91 = new ABDLVar(2);
  for(let v92 of range(v90,v91)) {
    let v93 = new ABDLVar(-2);
    let v94 = new ABDLVar(2);
    for(let v95 of range(v93,v94)) {
      let v97 = new ABDLVar([v92, v95]);
      let v96 = v82.add(v97);
      if ((await can_move(v82, v96)).getValue() != 0) {
         let v100 = new ABDLVar([v92, v95]);
         let v99 = v82.add(v100);
         let v98 = (await f3(v99, v83)).less_or_equal((await f3(v89, v83)));
         if (v98.getValue() != 0) {
            let v103 = new ABDLVar([v92, v95]);
            let v102 = v82.add(v103);
            let v101 = (await f3(v102, v83)).less_or_equal((await f3(v82, v83)));
            if (v101.getValue() != 0) {
               let v105 = new ABDLVar([v92, v95]);
               let v104 = v82.add(v105);
               v89 = v104;
            }
         }
      }
    }
  }
  return v89;
}
async function f3(v106, v107){
  let v111 = new ABDLVar(0);
  let v110 = new ABDLVar(v106.getValue()[v111.getValue()]);
  let v113 = new ABDLVar(0);
  let v112 = new ABDLVar(v107.getValue()[v113.getValue()]);
  let v109 = v110.sub(v112);
  let v116 = new ABDLVar(1);
  let v115 = new ABDLVar(v106.getValue()[v116.getValue()]);
  let v118 = new ABDLVar(1);
  let v117 = new ABDLVar(v107.getValue()[v118.getValue()]);
  let v114 = v115.sub(v117);
  let v108 = (await f4(v109)).add((await f4(v114)));
  return v108;
}
async function f4(v119){
  let v121 = new ABDLVar(0);
  let v120 = v119.greater_than(v121);
  if (v120.getValue() != 0) {
     return v119;
  }
  else {
     let v123 = new ABDLVar(0);
     let v122 = v123.sub(v119);
     return v122;
  }
}
async function f5(){
  let v125 = new ABDLVar(0);
  let v126 = new ABDLVar(0);
  let v124 = new ABDLVar([v125, v126]);
  let v127 = v124;
  let v129 = new ABDLVar(0);
  let v130 = new ABDLVar(0);
  let v128 = new ABDLVar([v129, v130]);
  let v131 = v128;
  let v132 = new ABDLVar(0);
  let v133 = v132;
  let v134 = new ABDLVar(0);
  let v136 = new ABDLVar(context.width);
  let v137 = new ABDLVar(1);
  let v135 = v136.sub(v137);
  for(let v138 of range(v134,v135)) {
    let v139 = new ABDLVar(0);
    let v141 = new ABDLVar(context.height);
    let v142 = new ABDLVar(1);
    let v140 = v141.sub(v142);
    for(let v143 of range(v139,v140)) {
      let v145 = new ABDLVar([v138, v143]);
      let v146 = new ABDLVar(0);
      let v144 = (getOwner(v145)).equal(v146);
      if (v144.getValue() != 0) {
         let v147 = new ABDLVar([v138, v143]);
         let v148 = (await f6(v147));
         let v149 = (await f7(v148)).greater_than((await f7(v131)));
         if (v149.getValue() != 0) {
            let v150 = new ABDLVar([v138, v143]);
            v127 = v150;
            v131 = v148;
         }
      }
    }
  }
  let v151 = v127.not_equal(v131);
  if (v151.getValue() != 0) {
     let v152 = v127.add(v131);
     await move(v127, v152);
  }
}
async function f6(v153){
  let v155 = new ABDLVar(0);
  let v156 = new ABDLVar(0);
  let v154 = new ABDLVar([v155, v156]);
  let v157 = v154;
  let v158 = new ABDLVar(0);
  let v159 = new ABDLVar(2);
  for(let v160 of range(v158,v159)) {
    let v161 = new ABDLVar(-2);
    let v162 = new ABDLVar(0);
    for(let v163 of range(v161,v162)) {
      let v165 = new ABDLVar([v160, v163]);
      let v164 = v153.add(v165);
      if ((await can_move(v153, v164)).getValue() != 0) {
         let v167 = new ABDLVar([v160, v163]);
         let v166 = (await f7(v167)).greater_than((await f7(v157)));
         if (v166.getValue() != 0) {
            let v168 = new ABDLVar([v160, v163]);
            v157 = v168;
         }
      }
    }
  }
  return v157;
}
async function f7(v169){
  let v173 = new ABDLVar(0);
  let v172 = new ABDLVar(v169.getValue()[v173.getValue()]);
  let v174 = new ABDLVar(2);
  let v171 = v172.pow(v174);
  let v177 = new ABDLVar(1);
  let v176 = new ABDLVar(v169.getValue()[v177.getValue()]);
  let v178 = new ABDLVar(2);
  let v175 = v176.pow(v178);
  let v170 = v171.add(v175);
  return v170;
}