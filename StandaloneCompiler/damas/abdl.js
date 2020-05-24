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
      let v210 = new ABDLVar(context.current_player);
      console.log(v210.toString());
      let v212 = new ABDLVar(context.current_player);
      let v213 = new ABDLVar(-1);
      let v211 = v212.equal(v213);
      if (v211.getValue() != 0) {
         let v214 = new ABDLVar(0);
         return v214;
      }
      let v216 = new ABDLVar(context.current_player);
      let v215 = new ABDLVar( await f0(v216));
    },
  main: async (arg_context, arg_table, arg_render) => {
    context = arg_context;
    table = arg_table;
    render = arg_render;
    let v209 = new ABDLVar(context.current_player);
    let v208 = new ABDLVar( await f0(v209));
  }
}
async function f0(v0){
  let v2 = new ABDLVar(0);
  let v4 = new ABDLVar(context.height);
  let v5 = new ABDLVar(1);
  let v3 = v4.sub(v5);
  let v1 = new ABDLVar([v2, v3]);
  let v6 = v1;
  let v9 = new ABDLVar(context.width);
  let v10 = new ABDLVar(1);
  let v8 = v9.sub(v10);
  let v11 = new ABDLVar(0);
  let v7 = new ABDLVar([v8, v11]);
  let v12 = v7;
  let v14 = new ABDLVar(0);
  let v16 = new ABDLVar(context.height);
  let v17 = new ABDLVar(1);
  let v15 = v16.sub(v17);
  let v13 = new ABDLVar([v14, v15]);
  let v18 = v13;
  let v20 = new ABDLVar(0);
  let v19 = v0.equal(v20);
  if (v19.getValue() != 0) {
     let v23 = new ABDLVar(context.width);
     let v24 = new ABDLVar(1);
     let v22 = v23.sub(v24);
     let v25 = new ABDLVar(0);
     let v21 = new ABDLVar([v22, v25]);
     v6 = v21;
     let v27 = new ABDLVar(0);
     let v29 = new ABDLVar(context.height);
     let v30 = new ABDLVar(1);
     let v28 = v29.sub(v30);
     let v26 = new ABDLVar([v27, v28]);
     v12 = v26;
     let v33 = new ABDLVar(context.width);
     let v34 = new ABDLVar(1);
     let v32 = v33.sub(v34);
     let v35 = new ABDLVar(0);
     let v31 = new ABDLVar([v32, v35]);
     v18 = v31;
  }
  let v36 = new ABDLVar(0);
  let v38 = new ABDLVar(context.width);
  let v39 = new ABDLVar(1);
  let v37 = v38.sub(v39);
  for(let v40 of range(v36,v37)) {
    let v41 = new ABDLVar(0);
    let v43 = new ABDLVar(context.height);
    let v44 = new ABDLVar(1);
    let v42 = v43.sub(v44);
    for(let v45 of range(v41,v42)) {
      let v47 = new ABDLVar([v40, v45]);
      let v46 = (getOwner(v47)).equal(v0);
      if (v46.getValue() != 0) {
         let v48 = new ABDLVar([v40, v45]);
         let v49 = (await f1(v48, v6, v0));
         let v51 = new ABDLVar([v40, v45]);
         let v50 = (await f2(v51, v49, v6)).greater_than((await f2(v18, v12, v6)));
         if (v50.getValue() != 0) {
            v12 = v49;
            let v52 = new ABDLVar([v40, v45]);
            v18 = v52;
         }
      }
    }
  }
  await move(v18, v12);
}
async function f1(v53, v54, v55){
  let v58 = new ABDLVar(context.width);
  let v59 = new ABDLVar(1);
  let v57 = v58.sub(v59);
  let v60 = new ABDLVar(0);
  let v56 = new ABDLVar([v57, v60]);
  let v61 = v56;
  let v63 = new ABDLVar(0);
  let v62 = v55.equal(v63);
  if (v62.getValue() != 0) {
     let v65 = new ABDLVar(0);
     let v67 = new ABDLVar(context.height);
     let v68 = new ABDLVar(1);
     let v66 = v67.sub(v68);
     let v64 = new ABDLVar([v65, v66]);
     v61 = v64;
  }
  let v69 = new ABDLVar(-2);
  let v70 = new ABDLVar(2);
  for(let v71 of range(v69,v70)) {
    let v72 = new ABDLVar(-2);
    let v73 = new ABDLVar(2);
    for(let v74 of range(v72,v73)) {
      let v76 = new ABDLVar([v71, v74]);
      let v78 = new ABDLVar(0);
      let v79 = new ABDLVar(0);
      let v77 = new ABDLVar([v78, v79]);
      let v75 = v76.not_equal(v77);
      if (v75.getValue() != 0) {
         let v81 = new ABDLVar([v71, v74]);
         let v80 = v53.add(v81);
         if ((await can_move(v53, v80)).getValue() != 0) {
            let v84 = new ABDLVar([v71, v74]);
            let v83 = v53.add(v84);
            let v82 = (await f2(v53, v83, v54)).greater_than((await f2(v53, v61, v54)));
            if (v82.getValue() != 0) {
               let v86 = new ABDLVar([v71, v74]);
               let v85 = v53.add(v86);
               v61 = v85;
            }
         }
      }
    }
  }
  return v61;
}
async function f2(v87, v88, v89){
  let v90 = (await f3(v87, v89)).sub((await f3(v88, v89)));
  return v90;
}
async function f3(v91, v92){
  let v96 = new ABDLVar(0);
  let v95 = new ABDLVar(v91.getValue()[v96.getValue()]);
  let v98 = new ABDLVar(0);
  let v97 = new ABDLVar(v92.getValue()[v98.getValue()]);
  let v94 = v95.sub(v97);
  let v101 = new ABDLVar(1);
  let v100 = new ABDLVar(v91.getValue()[v101.getValue()]);
  let v103 = new ABDLVar(1);
  let v102 = new ABDLVar(v92.getValue()[v103.getValue()]);
  let v99 = v100.sub(v102);
  let v93 = (await f4(v94)).add((await f4(v99)));
  return v93;
}
async function f4(v104){
  let v106 = new ABDLVar(0);
  let v105 = v104.greater_than(v106);
  if (v105.getValue() != 0) {
     return v104;
  }
  else {
     let v108 = new ABDLVar(0);
     let v107 = v108.sub(v104);
     return v107;
  }
}
async function f5(){
  let v110 = new ABDLVar(0);
  let v111 = new ABDLVar(0);
  let v109 = new ABDLVar([v110, v111]);
  let v112 = v109;
  let v114 = new ABDLVar(0);
  let v115 = new ABDLVar(0);
  let v113 = new ABDLVar([v114, v115]);
  let v116 = v113;
  let v117 = new ABDLVar(0);
  let v118 = v117;
  let v119 = new ABDLVar(0);
  let v121 = new ABDLVar(context.width);
  let v122 = new ABDLVar(1);
  let v120 = v121.sub(v122);
  for(let v123 of range(v119,v120)) {
    let v124 = new ABDLVar(0);
    let v126 = new ABDLVar(context.height);
    let v127 = new ABDLVar(1);
    let v125 = v126.sub(v127);
    for(let v128 of range(v124,v125)) {
      let v130 = new ABDLVar([v123, v128]);
      let v131 = new ABDLVar(0);
      let v129 = (getOwner(v130)).equal(v131);
      if (v129.getValue() != 0) {
         let v132 = new ABDLVar([v123, v128]);
         let v133 = (await f6(v132));
         let v134 = (await f8(v133)).greater_than((await f8(v116)));
         if (v134.getValue() != 0) {
            let v135 = new ABDLVar([v123, v128]);
            v112 = v135;
            v116 = v133;
         }
      }
    }
  }
  let v138 = new ABDLVar(0);
  let v139 = new ABDLVar(0);
  let v137 = new ABDLVar([v138, v139]);
  let v136 = v116.equal(v137);
  if (v136.getValue() != 0) {
     let v142 = new ABDLVar(context.width);
     let v143 = new ABDLVar(1);
     let v141 = v142.sub(v143);
     let v145 = new ABDLVar(context.height);
     let v146 = new ABDLVar(1);
     let v144 = v145.sub(v146);
     let v140 = new ABDLVar([v141, v144]);
     v116 = v140;
     let v147 = new ABDLVar(0);
     let v149 = new ABDLVar(context.width);
     let v150 = new ABDLVar(1);
     let v148 = v149.sub(v150);
     for(let v151 of range(v147,v148)) {
       let v152 = new ABDLVar(0);
       let v154 = new ABDLVar(context.height);
       let v155 = new ABDLVar(1);
       let v153 = v154.sub(v155);
       for(let v156 of range(v152,v153)) {
         let v158 = new ABDLVar([v151, v156]);
         let v159 = new ABDLVar(0);
         let v157 = (getOwner(v158)).equal(v159);
         if (v157.getValue() != 0) {
            let v160 = new ABDLVar([v151, v156]);
            let v161 = (await f7(v160));
            let v162 = (await f8(v161)).greater_than((await f8(v116)));
            if (v162.getValue() != 0) {
               let v163 = new ABDLVar([v151, v156]);
               v112 = v163;
               v116 = v161;
            }
         }
       }
     }
  }
  let v164 = v112.not_equal(v116);
  if (v164.getValue() != 0) {
     let v165 = v112.add(v116);
     await move(v112, v165);
  }
}
async function f6(v166){
  let v168 = new ABDLVar(0);
  let v169 = new ABDLVar(0);
  let v167 = new ABDLVar([v168, v169]);
  let v170 = v167;
  let v171 = new ABDLVar(0);
  let v172 = new ABDLVar(2);
  for(let v173 of range(v171,v172)) {
    let v174 = new ABDLVar(-2);
    let v175 = new ABDLVar(0);
    for(let v176 of range(v174,v175)) {
      let v178 = new ABDLVar([v173, v176]);
      let v177 = v166.add(v178);
      if ((await can_move(v166, v177)).getValue() != 0) {
         let v180 = new ABDLVar([v173, v176]);
         let v179 = (await f8(v180)).greater_than((await f8(v170)));
         if (v179.getValue() != 0) {
            let v181 = new ABDLVar([v173, v176]);
            v170 = v181;
         }
      }
    }
  }
  return v170;
}
async function f7(v182){
  let v184 = new ABDLVar(-2);
  let v185 = new ABDLVar(2);
  let v183 = new ABDLVar([v184, v185]);
  let v186 = v183;
  let v187 = new ABDLVar(-2);
  let v188 = new ABDLVar(0);
  for(let v189 of range(v187,v188)) {
    let v190 = new ABDLVar(0);
    let v191 = new ABDLVar(2);
    for(let v192 of range(v190,v191)) {
      let v194 = new ABDLVar([v189, v192]);
      let v193 = v182.add(v194);
      if ((await can_move(v182, v193)).getValue() != 0) {
         let v196 = new ABDLVar([v189, v192]);
         let v195 = (await f8(v196)).less_than((await f8(v186)));
         if (v195.getValue() != 0) {
            let v197 = new ABDLVar([v189, v192]);
            v186 = v197;
         }
      }
    }
  }
  return v186;
}
async function f8(v198){
  let v202 = new ABDLVar(0);
  let v201 = new ABDLVar(v198.getValue()[v202.getValue()]);
  let v203 = new ABDLVar(2);
  let v200 = v201.pow(v203);
  let v206 = new ABDLVar(1);
  let v205 = new ABDLVar(v198.getValue()[v206.getValue()]);
  let v207 = new ABDLVar(2);
  let v204 = v205.pow(v207);
  let v199 = v200.add(v204);
  return v199;
}